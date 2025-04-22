- [기사단원의 무기](https://school.programmers.co.kr/learn/courses/30/lessons/136798)

```java
    public int solution(int number, int limit, int power) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= number; i++) {
        int tmp = 1, count = 0;
        while (i >= tmp) {
            if (i % tmp == 0) {
                count++;
            }
            tmp++;
        }
        list.add(count);
    }
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) > limit) {
            list.set(i, power);
        }
        sum += list.get(i);
    }
    return sum;
}
```
- 첫 시도에서 테스트 11~16, 18, 24, 25가 시간 초과 돼버렸다.
  - 약수의 개수를 찾는 for 문이 문제인데 `number`수가 커질수록 매우 비효율적이다.
  - `number`가 100일 경우 51~99까지는 셀 필요가 없는 구간이다.

```java
    for (int i = 1; i * i <= n; i++) {
        /*
            if (i * i == n) {
            count += 1; // 제곱근이면 하나만 추가
            } else {
            count += 2; // i와 n/i 두 개의 약수 추가
            }
         */
        if (n % i == 0) {
            count += (i * i == n) ? 1 : 2;
        }
```
- `i ≤ √n`이라는 건 `i * i ≤ n`이라는 뜻과 같은 말임.
  -  왜 굳이 i * i <= n을 쓰나?
    - 자바에서는 Math.sqrt(n)을 쓰면 `실수(double)`로 반환함.
- 이렇게 `√n`까지만 검사하면 된다.
  - 왜냐하면 약수는 `쌍`으로 존재함.
    - Ex) 36일 경우 (1, 36), (2, 18), (3, 12), (4, 9), (6, 6)
    - 즉 한 쌍에서 작은 수를 찾아내면 나머지 큰 수를 구할 수 있음.
      - 여기서 6까지만 보면 그 이후는 단순히 순서가 바뀐 것(이미 확인한 쌍)일 뿐. 
      - 그래서 `i * i <= n`, `즉 i <= √n`까지만 반복하면 충분함.
    - n = 36에서 (6,6)처럼 약수가 중복되는 경우가 있음. (`완전제곱수`).
      - 이런 경우는 한 번만 세야 하므로 `삼항 연산자`를 사용했음.
- 처음 코드의 시간 복잡도가 `O(N)`이였다면 개선된 코드는 `O(√n)`이다.
- <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181854/solution_groups?language=java">배열의 길이에 따라 다른 연산하기</a>

```java
public int[] solution(int[] arr, int n) {
    for(int i = arr.length % 2 == 0 ? 1 : 0; i < arr.length; i += 2) {
        arr[i] += n;
    }
    return arr;
}
```
- 이 코드가 제일 나은 거 같음.
  - `for`문의 초기화부분과 증감식을 통해 배열의 길이와 인덱스값을 결정.
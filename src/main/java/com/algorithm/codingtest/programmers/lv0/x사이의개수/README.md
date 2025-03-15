- [x 사이의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/181867)

```java
public static void main(String[] args) {
    String myString = "oxooxoxxox";

    System.out.println(Arrays.toString(myString.split("x", -1)));
    // [o, oo, o, , o, ]
    System.out.println(Arrays.toString(solution2(myString)));
    // [1, 2, 1, 0, 1, 0]

    
    System.out.println(Arrays.toString(myString.split("x", 0)));
    // [o, oo, o, , o]
    System.out.println(Arrays.toString(solution(myString)));
    // [1, 2, 1, 0, 1]

    public static int[] solution(String myString) {
        String[] strArr = myString.split("x", 0);
                .....
    }
    public static int[] solution2(String myString){
        String[] strArr = myString.split("x", -1);
        
                .....
    }
    System.out.println(Arrays.toString(myString.split("x", 3)));    // 3개 요소로 분할.
    // [o, oo, oxxox]
```
- `myString.split("x", -1);`
  - split() 메서드의 두 번째 인수 `-1`은 분할 횟수 제한(limit)을 의미.
    - limit은 문자열을 몇 개의 부분으로 나눌지를 지정.
    - `-1`을 넣으면 `제한 없이 모든 분할`을 수행.
    - 즉, 빈 문자열도 포함한 최대한의 분할 결과가 반환.
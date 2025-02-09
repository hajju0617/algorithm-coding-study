<a href="https://school.programmers.co.kr/learn/courses/30/lessons/120833">배열 자르기</a>

```java
import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
```
- java.util.Arrays.copyOfRange() 메서드.
  - 배열의 특정 구간을 복사해서 새로운 배열을 생성하는 메서드.

```java
public static int[] copyOfRange(int[] original, int from, int to); 
```
- original : 원본 배열.
- from : 복사할 시작 인덱스. (포함)
- to : 복사할 끝 인덱스. (미포함)
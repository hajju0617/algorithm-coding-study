- <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120889">삼각형의 완성조건</a>

```java
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}
```
- `Arrays.sort(sides);`는 배열의 요소를 오름차순으로 정렬시켜줌.
  - `Ex` {5, 4, 3} ----> {3, 4, 5} 
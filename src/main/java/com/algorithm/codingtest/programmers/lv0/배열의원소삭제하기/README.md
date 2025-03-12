- [배열의 원소 삭제하기](https://school.programmers.co.kr/learn/courses/30/lessons/181844)

```java
import java.util.*;
public int[] solution(int[] arr, int[] delete_list) {
    List<Integer> list = new ArrayList<>();
    for(int n : arr) {
        list.add(n);
    }
    for(int n: delete_list) {
        list.remove((Integer)n);
    }
    int[] answer = new int[list.size()];
    for(int i=0; i<list.size(); i++){
        answer[i] = list.get(i);
    }
    return answer;
}
```
- `int`타입 `->` (Integer) n을 통해 Integer 객체로 명시적 형변환.
- 리스트에서 값이 n과 같은 첫 번째 요소가 제거 됨.
  - `ArrayList`에서 요소가 제거되면 뒤의 요소들이 자동으로 앞으로 이동하여 리스트의 연속성이 유지됨.

- <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181849">문자열 정수의 합</a>

```java
public int solution(String num_str) {
    int answer = 0;
    String[] numArr= num_str.split("");
    for (String num : numArr){
        answer += Integer.parseInt(num);
    }
    return answer;
}
```
- `split()`를 이용해서 문자열 배열로 만드는 방법도 좋은 방법인거 같음.
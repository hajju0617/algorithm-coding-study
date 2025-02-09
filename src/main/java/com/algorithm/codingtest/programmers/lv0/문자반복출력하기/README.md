<a href="https://school.programmers.co.kr/learn/courses/30/lessons/120825">문자 반복 출력하기</a>


```java
public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
```
- StringBuilder를 이용한 방식도 좋은 거 같음.
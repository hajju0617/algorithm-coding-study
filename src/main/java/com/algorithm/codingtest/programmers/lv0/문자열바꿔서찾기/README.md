- <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181864">문자열 바꿔서 찾기</a>


```java
public int solution(String myString, String pat) {
    myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
    return myString.contains(pat) ? 1 : 0;
}
```
- 임의로 다른 문자를 이용하는 창의적인 코드다.
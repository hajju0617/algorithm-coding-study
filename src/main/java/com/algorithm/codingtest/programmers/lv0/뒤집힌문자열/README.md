- [뒤집힌 문자열](https://school.programmers.co.kr/learn/courses/30/lessons/120822)

```java
public String solution(String my_string) {
    
    StringBuilder str = new StringBuilder(my_string);
    
    return str.reverse().toString();
}
```
- reverse() 메서드를 활용하는 방법.
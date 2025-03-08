- [l로 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/181834)

```java
public String solution(String myString) {
    return myString.replaceAll("[a-k]", "l");
}
```
- `replaceAll`메서드와 정규식을 통해서도 가능.
  - 문자열에서 특정 패턴(정규 표현식)에 해당하는 모든 부분을 새로운 문자열로 바꾸는 메서드.


| 메서드                                          | 설명                    |
|----------------------------------------------|-----------------------|
| replaceAll(String regex, String replacement) | 정규 표현식을 이용해 문자열 치환.   |
| replace(String target, String replacement)   | 단순 문자열 치환 (정규 표현식 X). |
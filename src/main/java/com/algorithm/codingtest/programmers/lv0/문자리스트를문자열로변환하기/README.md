- [문자 리스트를 문자열로 변환하기](https://school.programmers.co.kr/learn/courses/30/lessons/181941)


```java
public String solution(String[] arr) {
    return String.join("", arr);
}
```
```java
String.join(CharSequence delimiter, CharSequence... elements)
```
- `join`메서드는 문자열 배열 또는 컬렉션들을 지정한 구분자(delimiter)로 연결하여 하나의 문자열로 반환하는 메서드.
  - `delimiter` : 각 요소를 구분하는 문자열.
  - `elements` : 결합할 문자열 요소들.
- [접두사인지 확인하기](https://school.programmers.co.kr/learn/courses/30/lessons/181906)

```java
String str = "string";
String tmp = "ri";
str.contains(tmp);
```
- 특정 문자열이 포함 여부 검사.
  - str 안에 tmp가 포함되어 있는 지.

```java
public boolean startsWith(String prefix);
// toffset 인덱스부터 시작해서 prefix로 시작하는지를 검사.
public boolean startsWith(String prefix, int toffset);
```
- 특정 문자열로 시작하는지 검사.
  - 맨 앞(접두사) 부분이 prefix와 같은지를 확인.
- [특정한 문자를 대문자로 바꾸기](https://school.programmers.co.kr/learn/courses/30/lessons/181873)


```java
public String solution(String my_string, String alp) {
    String answer = "";
    for (int i = 0; i < my_string.length(); i++) {
        String str = my_string.charAt(i) + "";
        if(str.equals(alp)){
            str = str.toUpperCase();
        }
        answer += str;
    }
    return answer;
}
```
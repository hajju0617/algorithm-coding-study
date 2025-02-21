- <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181868">공백으로 구분하기 (2)</a>

```java
public String[] solution(String my_string) {
    String[] answer;
    int idx = 0;
    int len = 0;
    String[] temp= my_string.split(" ");

    for (String str : temp) {
        if (!(str.equals(""))) {
            len++;
        }
    }

    answer = new String[len];
    for (String str : temp) {
        if (!(str.equals(""))) {
            answer[idx++] = str;
        }
    }
    return answer;
}
```
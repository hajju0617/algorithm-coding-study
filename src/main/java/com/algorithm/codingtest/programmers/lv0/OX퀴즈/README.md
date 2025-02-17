- <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120907">OX 퀴즈</a>

```java
public String[] solution(String[] quiz) {
    for (int i = 0; i < quiz.length; i++) {
        String[] text = quiz[i].split(" ");
        int result = Integer.parseInt(text[0]) + (Integer.parseInt(text[2]) * (text[1].equals("+") ? 1 : -1));
        quiz[i] = result == Integer.parseInt(text[4]) ? "O" : "X";
    }
    return quiz;
}
```
- 이 코드가 제일 좋은 방식인 거 같음.
  - 새로운 배열 선언도 필요 없고 피연산자를 변수로 선언할 필요도 없음.
  - 어차피 기존 배열의 각 인덱스마다 수식들이 ("X {연산자} Y = Z") 들어가 있기 때문.
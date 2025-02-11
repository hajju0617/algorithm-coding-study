<a href="https://school.programmers.co.kr/learn/courses/30/lessons/120824">짝수 홀수 개수</a>


```java
public int[] solution(int[] num_list) {
    int[] answer = new int[2];

    for (int i = 0; i < num_list.length; i++) {
        answer[num_list[i] % 2]++;
    }
    return answer;
}
```
- 다른 사람 풀이 중 이게 제일 좋은 거 같음.
  - 홀수, 짝수이므로 2로 나눴을 때 0 아니면 1이니깐 굳이 if문 쓸 필요도 없다. 
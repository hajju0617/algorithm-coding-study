- [정수 내림차순으로 배치하기](https://school.programmers.co.kr/learn/courses/30/lessons/12933)


```java
public long solution(long n) {
    String[] list = String.valueOf(n).split("");
    Arrays.sort(list);

    StringBuilder sb = new StringBuilder();
    for (String str : list) {
        sb.append(str);
    }
    return Long.parseLong(sb.reverse().toString());
}
```
- `split("")`
  - 한 문자 단위로 분할.
- `sb.reverse().toString()`
  - 문자열 뒤집기. (오름차순 -> 내림차순)
  - StringBuilder를 String으로 변환.

- [수박수박수박수박수박수?](https://school.programmers.co.kr/learn/courses/30/lessons/12922)

```java
public String solution2(int n) {
    return "수박".repeat(n / 2) + "수".repeat(n % 2);
}
```
```java
public String repeat(int count);
```
- 주어진 문자열을 `count`번 반복.
  - 반환값 : 원본 문자열을 count 번 반복한 새로운 문자열.
- count가 0이면 `빈 문자열("")`을 반환.
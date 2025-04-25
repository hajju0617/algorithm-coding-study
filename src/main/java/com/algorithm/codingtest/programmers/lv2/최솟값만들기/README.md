- [최솟값 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12941)

```java
Arrays.sort();
```
- 위 메서드는 오름차순으로 정렬해줌.

```java
Arrays.sort(@, Comparator.reverseOrder());
```
- @ 자리에 정렬하고 싶은 걸 넣으면 내림차순으로 정렬해줌.
  - 다만, 기본형은 안 되고 객체 타입만 됨.
  - 즉, int[] 을 집어넣으면 컴파일 에러 발생함.
- 그래서 해당 문제에서 `Arrays.sort()`로 정렬한 다음에 `for`문을 이용해서 내림차순으로 정렬했음. 
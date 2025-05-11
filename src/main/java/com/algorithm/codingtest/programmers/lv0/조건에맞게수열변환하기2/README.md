- [조건에 맞게 수열 변환하기 2](https://school.programmers.co.kr/learn/courses/30/lessons/181881)

```java
public static int[] copyOf(int[] original, int newLength)
```
- 기존 배열 original의 앞에서부터 최대 newLength개 요소까지 복사한 새 배열을 반환함.
  - 만약 newLength가 original.length 보다 크다면 남은 부분은 0(기본값)으로 채움.
- 원본 배열과는 완전히 별개인 새로운 배열이 생성됨.

```java
int[] original = {1, 2, 3};
int[] copy1 = Arrays.copyOf(original, 1);
int[] copy2 = Arrays.copyOf(original, 2);
int[] copy3 = Arrays.copyOf(original, 3);

System.out.println(Arrays.toString(copy1));
System.out.println(Arrays.toString(copy2));
System.out.println(Arrays.toString(copy3));
```

---

```java
public static boolean equals(int[] a, int[] a2)
```
- 두 배열 a와 a2가 길이가 같고, 각 인덱스의 요소들이 모두 같은지 비교함.
  - 주소(reference)를 비교하는 것이 아니라, 값(value)들을 비교함.
- 내용이 완전히 같으면 true, 하나라도 다르면 false를 반환함.
```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
int[] c = {1, 2, 4};

System.out.println(Arrays.equals(a, b));    // true
System.out.println(Arrays.equals(a, c));    // false
```
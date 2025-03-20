- [뒤에서 5등 위로](https://school.programmers.co.kr/learn/courses/30/lessons/181852)

```java
public static int[] copyOfRange(int[] original, int from, int to)

// Ex)
public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60};

    // 인덱스 2부터 5(포함X)까지 복사
    int[] newArr = Arrays.copyOfRange(arr, 2, 5);

    System.out.println(Arrays.toString(newArr)); // [30, 40, 50]
}
```
- `Arrays.copyOfRange()`
  - 배열의 특정 범위를 복사하여 새로운 배열을 생성하는 메서드. 
    - original : 원본 배열.
    - from : 복사를 시작할 인덱스 (포함)
    - to : 복사를 종료할 인덱스 (제외)
  
```java
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

// Ex)
public static void main(String[] args) {
    int[] src = {1, 2, 3, 4, 5};
    int[] dest = new int[10];

    // src[1]부터 3개의 요소를 dest[3] 위치부터 복사
    System.arraycopy(src, 1, dest, 3, 3);

    System.out.println(Arrays.toString(dest));
    // [0, 0, 0, 2, 3, 4, 0, 0, 0, 0]
}
```
- `System.arraycopy()`
  - 배열의 특정 부분을 다른 배열로 복사하는 메서드.
    - src : 원본 배열.
    - srcPos : 원본 배열에서 복사를 시작할 인덱스.
    - dest : 복사된 데이터를 저장할 대상 배열.
    - destPos : 대상 배열에서 복사를 시작할 인덱스.
    - length : 복사할 요소의 개수 .
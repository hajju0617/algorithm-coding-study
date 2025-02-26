- [순서 바꾸기](https://school.programmers.co.kr/learn/courses/30/lessons/181891)

```java
Arrays.copyOfRange(원본 배열, 시작 인덱스, 끝 인덱스);

int[] source = {1, 2, 3, 4, 5};
int[] result = Arrays.copyOfRange(source, 1, 4);

// result
result = {2, 3, 4};
```
- 원본 배열 
- 시작 인덱스 : 원본 배열에서 복사를 시작할 인덱스 위치.
- 끝 인덱스 : 이 인덱스 이전까지의 데이터를 복사. (끝 인덱스는 포함X)
- 복사한 데이터를 저장할 새로운 배열을 반환. (원본 배열은 변경되지 않음.)


```java
System.arraycopy(원본 배열, 원본배열의 시작 인덱스, 복사할 배열, 복사할 배열의 시작 인덱스, 복사할 개수);


int[] source = {1, 2, 3, 4, 5};
int[] target = {0, 0, 0, 0, 0};

System.arraycopy(source, 1, target, 2, 3);

// target
target = {0, 0, 2, 3, 4};
```
- 복사할 배열의 시작 인덱스 : 복사된 데이터를 저장할 위치.
- 새로운 배열을 생성하지 않고, 대상 배열을 직접 수정.
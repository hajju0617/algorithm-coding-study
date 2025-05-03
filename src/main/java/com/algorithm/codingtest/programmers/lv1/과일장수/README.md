- [과일 장수](https://school.programmers.co.kr/learn/courses/30/lessons/135808)


```java
// 정렬없이 풀이. (더 나은 성능)
public int solution2(int k, int m, int[] score) {
    int[] sc2 = new int[k + 1];
    for(int i=0; i<score.length; i++) {
        sc2[score[i]]++;                //점수배열 sc2 : sc2[점수] = 갯수.
    }

    int sum = 0, mod = 0;
    for(int i = k; i > 0; i--){         // 점수가 높은 거에서 부터 낮은순으로 박스에 담기.
        sc2[i] = sc2[i] + mod;          // 남은 사과를 다음 점수에 해당하는 사과들의 개수에 더함.
        sum += (sc2[i] / m) * m * i;      // sum += 박스수 x 사과수 x 단가.
        mod = sc2[i] % m;               // mod : 박스에 넣고 남은 사과수.
    }
    return sum;
}
```
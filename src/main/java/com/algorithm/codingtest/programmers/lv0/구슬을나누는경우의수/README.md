- [구슬을 나누는 경우의 수](https://school.programmers.co.kr/learn/courses/30/lessons/120840)


```
(n, r) = n! / r!(n - r)!

여기서 분자 n!을 풀어 쓰면

(n, r) = (n*(n−1)....(n−r+1))*(n−r)! / r!(n - r)!
여기서 (n - r)!을 약분하면

(n, r) = (n*(n−1)....(n−r+1)) / r! 이 돼서
더 효율적이면서 오버플로우가 발생하지도 않음.
```
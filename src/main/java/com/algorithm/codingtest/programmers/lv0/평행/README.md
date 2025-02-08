<a href="https://school.programmers.co.kr/learn/courses/30/lessons/120875">평행</a>

```java
class Solution {
    public int solution(int[][] dots) {
        int answer = 0, count = 0;
        double[] saved = new double[6];
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double slope = (double) (dots[j][1] - dots[i][1]) / (dots[j][0] - dots[i][0]);
                saved[count++] = slope;
            }
        }
        for (int i = 0; i < saved.length - 1; i++) {
            for (int j = i + 1; j < saved.length; j++) {
                if (saved[i] == saved[j]) {
                    return 1;
                }
            }
        }
        return answer;
    }
}
// 테스트 12번부터 막힘.
```
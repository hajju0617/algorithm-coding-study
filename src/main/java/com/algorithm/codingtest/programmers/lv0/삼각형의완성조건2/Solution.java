package com.algorithm.codingtest.programmers.lv0.삼각형의완성조건2;

public class Solution {
    public int solution(int[] sides) {
        int result = 0;

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        // ↓ sides[0], sides[1] 둘 중 더 큰 값이 가장 긴 변일 경우.
        result += max - (max - min);

        // ↓ 나머지 한 변이 가장 긴 변일 경우.
        result += (sides[0] + sides[1]) - max - 1;

        return result;
    }
}

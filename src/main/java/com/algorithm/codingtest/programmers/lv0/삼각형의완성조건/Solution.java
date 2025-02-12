package com.algorithm.codingtest.programmers.lv0.삼각형의완성조건;

public class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            sum += sides[i];
        }
        if (max < sum - max) {
            return 1;
        } else {
            return 2;
        }
    }
}

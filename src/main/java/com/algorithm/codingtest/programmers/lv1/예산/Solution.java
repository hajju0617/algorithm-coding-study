package com.algorithm.codingtest.programmers.lv1.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {

        int count = 0;
        Arrays.sort(d);
        for (int num : d) {
            if (budget < num) {
                break;
            }
            budget -= num;
            count++;
        }
        return count;
    }
}

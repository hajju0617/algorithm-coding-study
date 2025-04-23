package com.algorithm.codingtest.programmers.lv0.가까운수;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int diffNum = Math.abs(n - array[0]), first = array[0];
        for (int i = 1; i < array.length; i++) {
            if (diffNum > Math.abs(n - array[i])) {
                first = array[i];
                diffNum = Math.abs(n - array[i]);
            }
        }
        return first;
    }
}

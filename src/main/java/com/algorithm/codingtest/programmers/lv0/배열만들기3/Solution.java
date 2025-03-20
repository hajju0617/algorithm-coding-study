package com.algorithm.codingtest.programmers.lv0.배열만들기3;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] numArr = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] numArr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        int[] result = new int[numArr.length + numArr2.length];

        System.arraycopy(numArr, 0, result, 0, numArr.length);
        System.arraycopy(numArr2, 0, result, numArr.length, numArr2.length);
        return result;
    }
}

package com.algorithm.codingtest.programmers.lv1.k번째수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] numArr = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int startPoint = commands[i][0] - 1;
            int endPoint = commands[i][1];
            int k = commands[i][2] - 1;
            int[] tmp = Arrays.copyOfRange(array, startPoint, endPoint);
            Arrays.sort(tmp);
            numArr[i] = tmp[k];
        }
        return numArr;
    }
}

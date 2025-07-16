package com.algorithm.codingtest.programmers.lv0.수열과구간쿼리2;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] numArr = new int[queries.length];
        Arrays.fill(numArr, -1);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (k < arr[j]) {
                    numArr[i] = (numArr[i] == -1) ? arr[j] : Math.min(numArr[i], arr[j]);
                }
            }
        }
        return numArr;
    }
}

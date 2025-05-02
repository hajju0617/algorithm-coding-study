package com.algorithm.codingtest.programmers.lv0.수열과구간쿼리4;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j == 0) {
                    arr[0]++;
                } else if (j % queries[i][2] == 0) {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}

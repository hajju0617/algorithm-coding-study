package com.algorithm.codingtest.programmers.lv0.수열과구간쿼리3;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = arr[i];
        }
        return numArr;
    }
}

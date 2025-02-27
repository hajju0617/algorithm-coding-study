package com.algorithm.codingtest.programmers.lv0.가까운1찾기;

public class Solution {
    public int solution(int[] arr, int idx) {
        int result = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                result = i;
                break;
            }
        }
        return result;
    }
}

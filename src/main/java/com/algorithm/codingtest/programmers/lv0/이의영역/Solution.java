package com.algorithm.codingtest.programmers.lv0.이의영역;

public class Solution {
    public int[] solution(int[] arr) {
        int first = -1, last = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first == -1) {
            return new int[]{-1};
        }
        int[] numArr = new int[last - first + 1];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = arr[first + i];
        }
        return numArr;
    }
}

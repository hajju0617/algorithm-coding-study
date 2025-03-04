package com.algorithm.codingtest.programmers.lv1.제일작은수제거하기;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        int[] numArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != minIndex) {
                numArr[j++] = arr[i];
            }
        }
        return numArr;
    }
}

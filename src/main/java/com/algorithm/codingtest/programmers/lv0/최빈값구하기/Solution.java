package com.algorithm.codingtest.programmers.lv0.최빈값구하기;

public class Solution {
    public int solution(int[] array) {
        int max = 0;
        for (int i : array) {
            max = Math.max(max, i);
        }
        int[] numArr = new int[max+1];
        for (int i : array) {
            numArr[i]++;
        }
        int maxCount = 0, result = 0;
        boolean bool = false;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > maxCount) {
                maxCount = numArr[i];
                result = i;
                bool = false;
            } else if (numArr[i] == maxCount) {
                bool = true;
            }
        }
        return bool ? -1 : result;
    }
}

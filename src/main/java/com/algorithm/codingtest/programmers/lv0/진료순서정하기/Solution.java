package com.algorithm.codingtest.programmers.lv0.진료순서정하기;

public class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] numArr = new int[length];
        for (int i = 0; i < length; i++) {
            numArr[i]++;
            for (int j = 0; j < length; j++) {
                if (i != j && emergency[i] <= emergency[j]) {
                    numArr[i]++;
                }
            }
        }
        return numArr;
    }
}

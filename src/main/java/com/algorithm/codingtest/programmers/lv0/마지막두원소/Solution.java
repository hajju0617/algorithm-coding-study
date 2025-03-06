package com.algorithm.codingtest.programmers.lv0.마지막두원소;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] numArr = new int[num_list.length + 1];
        int lastIdx = num_list.length - 1, secondLastIdx = num_list.length - 2;
        if (num_list[lastIdx] > num_list[secondLastIdx]) {
            for (int i = 0; i < num_list.length; i++) {
                numArr[i] = num_list[i];
            }
            numArr[numArr.length - 1] = num_list[lastIdx] - num_list[secondLastIdx];
        } else {
            for (int i = 0; i < num_list.length; i++) {
                numArr[i] = num_list[i];
            }
            numArr[numArr.length - 1] = num_list[lastIdx] * 2;
        }
        return numArr;
    }
}

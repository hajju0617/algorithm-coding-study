package com.algorithm.codingtest.programmers.lv0.배열의원소만큼추가하기;

public class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for (int num : arr) {
            size += num;
        }

        int[] numArr = new int[size];
        size = 0;
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                numArr[size++] += num;
            }
        }
        return numArr;
    }
}

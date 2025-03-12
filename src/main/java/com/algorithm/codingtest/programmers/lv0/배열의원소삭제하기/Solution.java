package com.algorithm.codingtest.programmers.lv0.배열의원소삭제하기;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean bool = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    bool = true;
                    break;
                }
            }
            if (!bool) {
                count++;
            }
        }
        int[] numArr = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean bool = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    bool = true;
                    break;
                }
            }
            if (!bool) {
                numArr[count++] = arr[i];
            }
        }
        return numArr;
    }
}

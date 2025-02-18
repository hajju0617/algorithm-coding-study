package com.algorithm.codingtest.programmers.lv0.배열의길이에따라다른연산하기;

public class Solution {
    public int[] solution(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                if (i % 2 == 1) {
                    arr[i] += n;
                }
            } else {
                if (i % 2 == 0) {
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}

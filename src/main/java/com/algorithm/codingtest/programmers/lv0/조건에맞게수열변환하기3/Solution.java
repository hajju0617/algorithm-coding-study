package com.algorithm.codingtest.programmers.lv0.조건에맞게수열변환하기3;

public class Solution {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * k;
            }
        }
        return arr;
    }
}

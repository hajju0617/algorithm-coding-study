package com.algorithm.codingtest.programmers.lv0.조건에맞게수열변환하기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        int count = 0;
        boolean changed = false;

        while (!changed) {
            int[] tmpArr = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                } else if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                }
            }
            changed = Arrays.equals(arr, tmpArr);
            if (!changed) {
                count++;
            }
        }
        return count;
    }
}

package com.algorithm.codingtest.programmers.lv1.나누어떨어지는숫자배열;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }
        if (count == 0) {
            return new int[]{-1};
        }
        int[] numArr = new int[count];
        count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                numArr[count++] = num;
            }
        }
        Arrays.sort(numArr);
        return numArr;
    }
}

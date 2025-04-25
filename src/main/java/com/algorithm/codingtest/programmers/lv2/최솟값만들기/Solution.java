package com.algorithm.codingtest.programmers.lv2.최솟값만들기;

import java.util.Arrays;

public class Solution {
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < B.length / 2; i++) {
            int tmp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = tmp;
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }
        return sum;
    }
}

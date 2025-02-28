package com.algorithm.codingtest.baekjoon.bronze.problem2751;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        int[] numArr = new int[numCount];

        for (int i = 0; i < numCount; i++) {
            numArr[i] = sc.nextInt();
        }
        Arrays.sort(numArr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numCount; i++) {
            sb.append(numArr[i]).append("\n");
        }
        System.out.println(sb);
    }
}

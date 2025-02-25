package com.algorithm.codingtest.baekjoon.bronze.problem1546;

import java.io.IOException;
import java.util.Scanner;

public class Solution1546 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int subjectNum = scanner.nextInt();
        int[] scoreArr = new int[subjectNum];
        int sum = 0, max = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = scanner.nextInt();
            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
            sum += scoreArr[i];
        }
        System.out.println(((double) (sum) / max * 100.0) / subjectNum);
    }
}

package com.algorithm.codingtest.baekjoon.bronze.problem1110;

import java.util.Scanner;

public class Solution1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNum = sc.nextInt();
        int tmpNum = originalNum, count = 0;

        while (true) {
            int sum = (tmpNum / 10) + (tmpNum % 10);
            tmpNum = (tmpNum % 10 * 10) + (sum % 10);
            count++;

            if (tmpNum == originalNum) {
                break;
            }
        }
        System.out.println(count);
    }
}

package com.algorithm.codingtest.programmers.lv0.짝수의합;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        if (n % 2 == 0) {
            return (n / 2 * (2 + n)) / 2;       // 등차수열의 합
        } else {
            return ((n - 1) / 2 * (2 + n)) / 2;
        }
    }
}

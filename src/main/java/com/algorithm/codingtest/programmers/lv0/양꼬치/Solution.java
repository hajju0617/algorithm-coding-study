package com.algorithm.codingtest.programmers.lv0.양꼬치;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(solution(n, k));

    }

    public static int solution(int n, int k) {
        return (n * 12000) + (k * 2000 - ((n / 10) * 2000));
    }
}

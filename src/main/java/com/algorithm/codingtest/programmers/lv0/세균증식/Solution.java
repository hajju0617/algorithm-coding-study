package com.algorithm.codingtest.programmers.lv0.세균증식;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println(solution(n, t));
    }

    public static int solution(int n, int t) {
        int sum = n;
        for (int i = 1; i <= t; i++) {
            sum *= 2;
        }
        return sum;
    }

    // 다른 사람 풀이 중 가장 괜찮아보였던 것.
    public static int solution2(int n, int t) {
        return (int)Math.pow(2, t) * n;
        // pow : 거듭제곱
    }

}

package com.algorithm.codingtest.programmers.lv1.최대공약수와최소공배수;

public class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        for (int i = Math.min(n, m); i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }
}

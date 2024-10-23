package com.algorithm.codingtest.programmers.lv0.두수의나눗셈;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        boolean bool = (0< num1 && num1 <= 100) && (0 < num2 && num2 <= 100);
        if(bool) {
            double n = num1 / (double)num2 * 1000;
            return (int)n;
        }
        return -1;
    }
}

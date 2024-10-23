package com.algorithm.codingtest.programmers.lv0.배열의평균값;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(solution(numbers));



    }

    public static double solution(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}

package com.algorithm.codingtest.programmers.lv0.몫구하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        System.out.println(solution(num1, num2));
    }
    public static int solution(int num1, int num2) {
        int answer = 0;
        if(0 < num1 && num1 <= 100) {
            if(0 < num2 && num2 <= 100) {
                answer = num1 / num2;
            }
        }
        return answer;
    }
}

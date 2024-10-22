package com.algorithm.codingtest.programmers.lv0.숫자비교하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(solution(num1, num2));

    }

    public static int solution(int num1, int num2) {
        boolean bool = (0 <= num1 && num1 <= 10000) && (0 <= num2 && num2 <= 10000);
        if(bool) {
            int answer = num1 == num2 ? 1 : -1;
            return answer;
        }
        return 0;
    }
}

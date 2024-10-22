package com.algorithm.codingtest.programmers.lv0.나이출력;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(solution(age));
    }

    public static int solution(int age) {
        boolean bool = (0 < age && age <= 120);
        int tmp = 2022;
        if(bool) {
            return tmp - age + 1;
        }
        return 0;
    }
}

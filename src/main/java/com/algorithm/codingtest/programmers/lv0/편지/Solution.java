package com.algorithm.codingtest.programmers.lv0.편지;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println(solution(message));
    }

    public static int solution(String message) {
        return message.length() * 2;
    }

}

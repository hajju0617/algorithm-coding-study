package com.algorithm.codingtest.programmers.lv0.홀짝구분하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n % 2 == 0 ? n + " is even" : n + " is odd");
    }
}

package com.algorithm.codingtest.programmers.lv0.간단한식계산하기;

public class Solution {
    public int solution(String binomial) {
        String[] strArr = binomial.split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[2]);

        switch (strArr[1]) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            default -> {
                return a * b;
            }
        }
    }
}

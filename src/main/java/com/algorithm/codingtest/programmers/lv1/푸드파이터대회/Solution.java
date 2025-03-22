package com.algorithm.codingtest.programmers.lv1.푸드파이터대회;

public class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }
        String left = sb.toString();
        String right = sb.reverse().toString();
        return left + "0" + right;
    }
}

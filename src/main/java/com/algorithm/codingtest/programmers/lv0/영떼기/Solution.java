package com.algorithm.codingtest.programmers.lv0.영떼기;

public class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder(n_str);
        int num = 0;
        while (sb.charAt(num) == '0') {
            sb.deleteCharAt(num);
        }
        return sb.toString();
    }
    public String solution2(String n_str) {
        return "" + Integer.parseInt(n_str);
    }
    public String solution3(String nStr) {
        return String.valueOf(Integer.parseInt(nStr));
    }
}

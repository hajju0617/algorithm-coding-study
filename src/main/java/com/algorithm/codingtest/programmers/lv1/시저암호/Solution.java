package com.algorithm.codingtest.programmers.lv1.시저암호;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chArr = s.toCharArray();
        for (char ch : chArr) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) ('A' + ((ch - 'A' + n) % 26)));
            } else if (ch >= 'a' && ch <= 'z') {
                sb.append((char) ('a' + (((ch - 'a' + n)) % 26)));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

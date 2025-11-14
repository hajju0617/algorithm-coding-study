package com.algorithm.codingtest.programmers.lv1.문자열나누기;

public class Solution {
    public int solution(String s) {
        char[] chArr = s.toCharArray();
        int same = 0, diff = 0, count = 0;
        char ch = ' ';
        for (int i = 0; i < chArr.length; i++) {
            if (ch == ' ') {
                ch = chArr[i];
                same++;
            } else {
                if (chArr[i] == ch) {
                    same++;
                } else {
                    diff++;
                }
            }
            if (same == diff) {
                count++;
                same = 0;
                diff = 0;
                ch = ' ';
            }
        }
        if (ch != ' ') {
            count++;
        }
        return count;
    }
}

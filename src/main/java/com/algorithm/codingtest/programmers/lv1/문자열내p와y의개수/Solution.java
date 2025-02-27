package com.algorithm.codingtest.programmers.lv1.문자열내p와y의개수;

public class Solution {
    boolean solution(String s) {
        int countP = 0, countY = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'p') {
                countP++;
            } else if (ch == 'y') {
                countY++;
            }
        }
        return countP == countY;
    }
}

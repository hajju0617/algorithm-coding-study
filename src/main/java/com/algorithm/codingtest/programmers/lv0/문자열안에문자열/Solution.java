package com.algorithm.codingtest.programmers.lv0.문자열안에문자열;

public class Solution {
    public int solution(String str1, String str2) {
        if (str1.indexOf(str2) != -1) {
            return 1;
        } else {
            return 2;
        }
    }
}

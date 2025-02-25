package com.algorithm.codingtest.programmers.lv1.가운데글자가져오기;

public class Solution {
    public String solution(String s) {
        int length = s.length();
        return length % 2 != 0 ? String.valueOf(s.charAt(length / 2))
                               : String.valueOf(s.charAt(length / 2 - 1)) + String.valueOf(s.charAt(length / 2));
    }
}

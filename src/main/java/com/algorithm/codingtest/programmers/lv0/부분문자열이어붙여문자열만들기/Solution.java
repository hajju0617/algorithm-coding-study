package com.algorithm.codingtest.programmers.lv0.부분문자열이어붙여문자열만들기;

public class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            sb.append(my_strings[i].substring(start, end + 1));
        }
        return sb.toString();
    }
}

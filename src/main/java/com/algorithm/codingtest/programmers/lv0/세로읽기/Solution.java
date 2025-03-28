package com.algorithm.codingtest.programmers.lv0.세로읽기;

public class Solution {
    public String solution(String my_string, int m, int c) {
        int length = my_string.length() / m;
        String[][] strArr = new String[length][m];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < m; j++) {
                strArr[i][j] = String.valueOf(my_string.charAt(i * m + j));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(strArr[i][c - 1]);
        }
        return sb.toString();
    }
}

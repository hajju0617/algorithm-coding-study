package com.algorithm.codingtest.programmers.lv0.문자열여러번뒤집기;

public class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            while (start < end) {
                char tmp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = tmp;
                start++;
                end--;
            }
        }
        return new String(charArr);
    }
}

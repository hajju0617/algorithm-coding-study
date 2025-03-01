package com.algorithm.codingtest.programmers.lv0.문자열의앞의n글자;

public class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
    public String solution2(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");

        for (int i = 0; i < n; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }

}

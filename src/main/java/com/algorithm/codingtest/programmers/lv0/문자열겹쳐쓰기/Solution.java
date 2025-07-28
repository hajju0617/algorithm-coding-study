package com.algorithm.codingtest.programmers.lv0.문자열겹쳐쓰기;

public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s));
        sb.append(overwrite_string);

        if ((my_string.length() - s) > overwrite_string.length()) {
            int lengthDiff = s + overwrite_string.length();
            sb.append(my_string.substring(lengthDiff));
        }
        return sb.toString();
    }
}

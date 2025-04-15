package com.algorithm.codingtest.programmers.lv0.문자열뒤집기;

public class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(0, s);
        StringBuilder sb = new StringBuilder();
        for (int i = e; i >= s; i--) {
            sb.append(my_string.charAt(i));
        }
        if (e + 1 < my_string.length()) {
            for (int i = e + 1; i < my_string.length(); i++) {
                sb.append(my_string.charAt(i));
            }
        }
        return str + sb.toString();
    }
}

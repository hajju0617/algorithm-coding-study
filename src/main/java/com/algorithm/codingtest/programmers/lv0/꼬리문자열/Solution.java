package com.algorithm.codingtest.programmers.lv0.꼬리문자열;

public class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for (String str : str_list) {
            if (!str.contains(ex)) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}

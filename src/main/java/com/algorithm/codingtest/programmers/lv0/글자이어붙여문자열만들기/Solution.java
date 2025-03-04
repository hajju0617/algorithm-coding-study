package com.algorithm.codingtest.programmers.lv0.글자이어붙여문자열만들기;

public class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }
        return sb.toString();
    }
}

package com.algorithm.codingtest.programmers.lv0.문자열의뒤의n글자;

public class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}

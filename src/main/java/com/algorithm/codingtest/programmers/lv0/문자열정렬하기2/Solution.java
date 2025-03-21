package com.algorithm.codingtest.programmers.lv0.문자열정렬하기2;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        char[] chArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }
}

package com.algorithm.codingtest.programmers.lv0.대문자와소문자;

public class Solution {
    public String solution(String my_string) {
        char[] chArr = my_string.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if ('a' <= chArr[i] && chArr[i] <= 'z') {
                chArr[i] -= 32;
            } else {
                chArr[i] += 32;
            }
        }
        return new String(chArr);
    }
}

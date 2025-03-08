package com.algorithm.codingtest.programmers.lv0.l로만들기;

public class Solution {
    public String solution(String myString) {
        char[] chArr = myString.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] < 'l') {
                chArr[i] = 'l';
            }
        }
        return new String(chArr);
    }
}

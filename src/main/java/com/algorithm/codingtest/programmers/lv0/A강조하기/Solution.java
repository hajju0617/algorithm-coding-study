package com.algorithm.codingtest.programmers.lv0.A강조하기;

public class Solution {
    public String solution(String myString) {
        char[] chArr = myString.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == 'a') {
                chArr[i] = 'A';
            } else if ('B' <= chArr[i] && chArr[i] <= 'Z') {
                chArr[i] = Character.toLowerCase(chArr[i]);
            }
        }
        return String.valueOf(chArr);
    }
}

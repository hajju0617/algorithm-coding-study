package com.algorithm.codingtest.programmers.lv0.특정문자열로끝나는가장긴부분문자열찾기;

public class Solution {
    public String solution(String myString, String pat) {
        int num = 0, count = 0;
        while (true) {
            int found = myString.indexOf(pat, count);
            if (found == -1) {
                break;
            }
            num = found;
            count++;
        }
        return myString.substring(0, num + pat.length());
    }
}

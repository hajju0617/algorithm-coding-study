package com.algorithm.codingtest.programmers.lv0.문자열바꿔서찾기;

public class Solution {
    public int solution(String myString, String pat) {
        StringBuilder str = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                str.append('B');
            } else {
                str.append('A');
            }
        }
        if (str.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}

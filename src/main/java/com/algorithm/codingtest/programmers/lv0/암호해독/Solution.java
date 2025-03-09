package com.algorithm.codingtest.programmers.lv0.암호해독;

public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}

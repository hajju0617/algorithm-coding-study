package com.algorithm.codingtest.programmers.lv1.핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        int index = phone_number.length();

        for (int i = 0; i < index - 4; i++) {
            sb.setCharAt(i, '*');
        }
        return sb.toString();
    }
}

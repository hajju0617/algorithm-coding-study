package com.algorithm.codingtest.programmers.lv0.이진수더하기;

public class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString((Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2)));
    }
}

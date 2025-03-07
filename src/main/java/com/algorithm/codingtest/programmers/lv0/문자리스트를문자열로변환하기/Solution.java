package com.algorithm.codingtest.programmers.lv0.문자리스트를문자열로변환하기;

public class Solution {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}

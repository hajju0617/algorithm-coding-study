package com.algorithm.codingtest.programmers.lv0.원하는문자열찾기;

public class Solution {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}

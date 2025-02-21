package com.algorithm.codingtest.programmers.lv0.공백으로구분하기2;

public class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");  // 1개 이상의 공백.
    }
}

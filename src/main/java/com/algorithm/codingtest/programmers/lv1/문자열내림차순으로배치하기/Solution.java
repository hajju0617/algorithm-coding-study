package com.algorithm.codingtest.programmers.lv1.문자열내림차순으로배치하기;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);

        StringBuilder sb = new StringBuilder(new String(chArr));
        return sb.reverse().toString();
    }
}

package com.algorithm.codingtest.programmers.lv1.정수내림차순으로배치하기;

import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        char[] chArr = String.valueOf(n).toCharArray();
        Arrays.sort(chArr);

        String result = "";
        for (int i = chArr.length - 1; i >= 0; i--) {
            result += chArr[i];
        }
        return Long.parseLong(result);
    }
}

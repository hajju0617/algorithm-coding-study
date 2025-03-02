package com.algorithm.codingtest.programmers.lv0.접미사배열;

import java.util.Arrays;

public class Solution {
    public String[] solution(String my_string) {
        String[] suffixArr = new String[my_string.length()];

        for (int i = 0; i < suffixArr.length; i++) {
            suffixArr[i] = my_string.substring(i);
        }
        Arrays.sort(suffixArr);
        return suffixArr;
    }
}

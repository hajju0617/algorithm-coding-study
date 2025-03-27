package com.algorithm.codingtest.programmers.lv0.문자열잘라서정렬하기;

import java.util.Arrays;

public class Solution {
    public static String[] solution(String myString) {
        String[] strArr = myString.split("x+");

        int count = 0;
        for (String str : strArr) {
            if (!(str.isEmpty())) {
                strArr[count++] = str;
            }
        }
        String[] result = Arrays.copyOf(strArr, count);
        Arrays.sort(result);
        return result;
    }
}

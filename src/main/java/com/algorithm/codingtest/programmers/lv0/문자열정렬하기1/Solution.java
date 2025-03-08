package com.algorithm.codingtest.programmers.lv0.문자열정렬하기1;

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.getNumericValue(my_string.charAt(i)) >= 0 &&
                    Character.getNumericValue(my_string.charAt(i)) < 10) {
                count++;
            }
        }
        int[] numArr = new int[count];
        count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.getNumericValue(my_string.charAt(i)) >= 0 &&
                    Character.getNumericValue(my_string.charAt(i)) < 10) {
                numArr[count++] = Character.getNumericValue(my_string.charAt(i));
            }
        }
        Arrays.sort(numArr);
        return numArr;
    }
}

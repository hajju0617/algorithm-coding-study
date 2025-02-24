package com.algorithm.codingtest.programmers.lv0.다섯명씩;

public class Solution {
    public String[] solution(String[] names) {
        String[] result = new String[(names.length + 4) / 5];
        int count = 0;

        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                result[count++] = names[i];
            }
        }
        return result;
    }
}

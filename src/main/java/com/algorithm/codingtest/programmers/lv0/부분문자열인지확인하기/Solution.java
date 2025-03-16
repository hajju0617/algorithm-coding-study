package com.algorithm.codingtest.programmers.lv0.부분문자열인지확인하기;

public class Solution {
    public int solution(String my_string, String target) {
        int targetLength = target.length();
        int my_stringLength = my_string.length();

        for (int i = 0; i <= my_stringLength - targetLength; i++) {
            if (target.charAt(0) == my_string.charAt(i)) {
                boolean flag = true;
                for (int j = 0; j < targetLength; j++) {
                    if (target.charAt(j) != my_string.charAt(i + j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return 1;
                }
            }
        }
        return 0;
    }
}

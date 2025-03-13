package com.algorithm.codingtest.programmers.lv0.공백으로구분하기1;

public class Solution {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
    public int solution2(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();

        for(int i = 0; i <= str2Len - str1Len; i++) {
            if(str1.charAt(0) == str2.charAt(i)) {
                boolean flag = true;
                for(int j = 0; j < str1Len; j++) {
                    if(str1.charAt(j) != str2.charAt(i + j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    return 1;
                }
            }
        }
        return 0;
    }
}

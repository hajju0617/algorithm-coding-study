package com.algorithm.codingtest.programmers.lv0.잘라서배열로저장하기;

public class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int) Math.ceil(my_str.length() / (double) n);
        String[] strArr = new String[length];

        int count = 0;
        for (int i = 0; i < my_str.length(); i += n) {
            int end = Math.min(i + n, my_str.length());
            strArr[count++] = my_str.substring(i, end);
        }
        return strArr;
    }
}

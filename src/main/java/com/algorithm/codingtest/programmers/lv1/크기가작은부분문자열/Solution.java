package com.algorithm.codingtest.programmers.lv1.크기가작은부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int size = p.length(), count = 0;

        for (int i = 0; i <= t.length() - size; i++) {
            long num = (Long.parseLong(t.substring(i, i + size)));
            if (num <= Long.parseLong(p)) {
                count++;
            }
        }
        return count;
    }
}

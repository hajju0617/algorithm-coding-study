package com.algorithm.codingtest.programmers.lv0.문자개수세기;

public class Solution {
    public int[] solution(String my_string) {
        // A~Z : 0~25, a~z : 26~51
        int[] numArr = new int[52];

        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                numArr[ch - 'A']++;
            } else {
                numArr[ch - 'a' + 26]++;
            }
        }
        return numArr;
    }
}

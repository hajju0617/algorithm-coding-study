package com.algorithm.codingtest.programmers.lv1.가장가까운같은글자;

public class Solution {
    public int[] solution(String s) {
        int[] numArr = new int[s.length()];
        int[] sequence = new int[26];

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = -1;
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (sequence[index] == -1) {
                numArr[i] = -1;
            } else {
                numArr[i] = i - sequence[index];
            }
            sequence[index] = i;
        }
        return numArr;
    }
}

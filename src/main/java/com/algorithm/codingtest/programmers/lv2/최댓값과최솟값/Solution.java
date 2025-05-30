package com.algorithm.codingtest.programmers.lv2.최댓값과최솟값;

public class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            int num = Integer.parseInt(strArr[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return min + " " + max;
    }
}

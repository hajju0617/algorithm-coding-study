package com.algorithm.codingtest.programmers.lv0.문자열계산하기;

public class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int sum = Integer.parseInt(strArr[0]);

        for (int i = 1; i < strArr.length; i += 2) {
            int num = Integer.parseInt(strArr[i + 1]);

            if ("+".equals(strArr[i])) {
                sum += num;
            } else {
                sum -= num;
            }
        }
        return sum;
    }
}

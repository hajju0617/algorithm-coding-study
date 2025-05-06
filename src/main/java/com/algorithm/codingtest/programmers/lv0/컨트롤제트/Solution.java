package com.algorithm.codingtest.programmers.lv0.컨트롤제트;

public class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");
        int[] numArr = new int[strArr.length];
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if ("Z".equals(strArr[i])) {
                if (count > 0) {
                    numArr[count - 1] = 0;
                }
            } else {
                numArr[count++] = Integer.parseInt(strArr[i]);
            }
        }
        int sum = 0;
        for (int num : numArr) {
            sum += num;
        }
        return sum;
    }
}

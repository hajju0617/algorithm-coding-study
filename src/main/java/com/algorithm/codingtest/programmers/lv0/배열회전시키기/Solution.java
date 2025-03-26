package com.algorithm.codingtest.programmers.lv0.배열회전시키기;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] numArr = new int[length];

        if ("left".equals(direction)) {
            numArr[length - 1] = numbers[0];
            for (int i = 0; i < length - 1; i++) {
                numArr[i] = numbers[i + 1];
            }
        } else {
            numArr[0] = numbers[length - 1];
            for (int i = 1; i < length; i++) {
                numArr[i] = numbers[i - 1];
            }
        }
        return numArr;
    }
}

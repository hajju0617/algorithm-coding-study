package com.algorithm.codingtest.programmers.lv1.일차다트게임;

public class Solution {
    public int solution(String dartResult) {
        char[] chArr = dartResult.toCharArray();
        int[] scores = new int[3];
        int index = -1;

        for (int i = 0; i < chArr.length; i++) {
            switch (chArr[i]) {
                case 'S' -> scores[index] = (int) Math.pow(scores[index], 1);
                case 'D' -> scores[index] = (int) Math.pow(scores[index], 2);
                case 'T' -> scores[index] = (int) Math.pow(scores[index], 3);
                case '*' -> {
                    scores[index] *= 2;
                    if (index > 0) {
                        scores[index - 1] *= 2;
                    }
                }
                case '#' -> {
                    scores[index] *= -1;
                }
                default -> {
                    index++;
                    if (chArr[i] == '1' && i + 1 < chArr.length && chArr[i + 1] == '0') {
                        scores[index] = 10;
                        i++;
                    } else {
                        scores[index] = Integer.parseInt(String.valueOf(chArr[i]));
                    }
                }
            }
        }
        return scores[0] + scores[1] + scores[2];
    }
}

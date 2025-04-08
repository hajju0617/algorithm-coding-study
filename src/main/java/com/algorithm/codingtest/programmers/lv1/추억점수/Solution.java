package com.algorithm.codingtest.programmers.lv1.추억점수;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] numArr = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (name[k].equals(photo[i][j])) {
                        sum += yearning[k];
                        break;
                    }
                }
            }
            numArr[i] += sum;
        }
        return numArr;
    }
}

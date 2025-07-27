package com.algorithm.codingtest.programmers.lv0.정사각형으로만들기;

public class Solution {
    public int[][] solution(int[][] arr) {
        if (arr.length > arr[0].length) {
            int[][] numArr = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    numArr[i][j] = arr[i][j];
                }
            }
            return numArr;
        } else if (arr.length < arr[0].length) {
            int[][] numArr = new int[arr[0].length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    numArr[i][j] = arr[i][j];
                }
            }
            return numArr;
        } else {
            return arr;
        }
    }
}

package com.algorithm.codingtest.programmers.lv0.n번째원소부터;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] intArr = new int[num_list.length - n + 1];
        int count = 0;

        for (int i = n - 1; i < num_list.length; i++) {
            intArr[count++] = num_list[i];
        }
        return intArr;
    }
    public int[] solution2(int[] numList, int n) {
        return Arrays.copyOfRange(numList, n - 1, numList.length);
        // Arrays.copyOfRange(복사할 배열, 복사 시작 인덱스 (포함), 종료 인덱스 (미포함))
    }
}

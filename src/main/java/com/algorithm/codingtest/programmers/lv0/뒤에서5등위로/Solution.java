package com.algorithm.codingtest.programmers.lv0.뒤에서5등위로;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
    public int[] solution2(int[] num_list) {
        Arrays.sort(num_list);
        int[] numArr = new int[num_list.length - 5];
        for (int i = 5; i < num_list.length; i++) {
            numArr[i - 5] = num_list[i];
        }
        return numArr;
    }
}

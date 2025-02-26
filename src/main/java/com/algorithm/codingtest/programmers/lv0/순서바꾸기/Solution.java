package com.algorithm.codingtest.programmers.lv0.순서바꾸기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        int[] answer = new int[num_list.length];

        for (int i = n; i < num_list.length; i++) {
            answer[count++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[count++] = num_list[i];
        }
        return answer;
    }
    public int[] solution2(int[] num_list, int n) {
        int[] back = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] front = Arrays.copyOfRange(num_list, 0, n);

        int[] result = new int[num_list.length];
        System.arraycopy(back, 0, result, 0, back.length);
        System.arraycopy(front, 0, result, back.length, front.length);
        return result;
    }
}

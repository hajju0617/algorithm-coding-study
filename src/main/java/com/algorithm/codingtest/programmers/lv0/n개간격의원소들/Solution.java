package com.algorithm.codingtest.programmers.lv0.n개간격의원소들;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length / n + (num_list.length % n == 0 ? 0 : 1)];
        int count = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                result[count++] = num_list[i];
            }
        }
        return result;
    }
}

package com.algorithm.codingtest.programmers.lv0.배열뒤집기;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] tmp = new int[num_list.length];
        int num = 0;
        for (int i = num_list.length - 1; i >= 0; i--) {
            tmp[num++] = num_list[i];
        }
        return tmp;
    }
}

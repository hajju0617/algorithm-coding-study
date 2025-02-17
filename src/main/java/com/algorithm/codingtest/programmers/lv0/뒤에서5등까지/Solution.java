package com.algorithm.codingtest.programmers.lv0.뒤에서5등까지;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}

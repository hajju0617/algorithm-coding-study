package com.algorithm.codingtest.programmers.lv1.최소직사각형;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        int width = 0, length = 0;
        for (int i = 0; i < sizes.length; i++) {
            width = Math.max(Math.max(sizes[i][0], sizes[i][1]), width);
            length = Math.max(Math.min(sizes[i][0], sizes[i][1]), length);
        }
        return width * length;
    }
}

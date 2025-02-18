package com.algorithm.codingtest.programmers.lv0.다음에올숫자;

public class Solution {
    public int solution(int[] common) {
        boolean as = (common[1] - common[0]) == (common[2] - common[1]);
        int lastIndex = common.length -1;
        if (as) {
            return common[lastIndex] + (common[1] - common[0]);
        } else {
            return common[lastIndex] * (common[1] / common[0]);
        }
    }
}

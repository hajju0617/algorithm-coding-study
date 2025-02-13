package com.algorithm.codingtest.programmers.lv0.중앙값구하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);     // 오름차순 정렬.
        return array[(array.length / 2)];
    }
}

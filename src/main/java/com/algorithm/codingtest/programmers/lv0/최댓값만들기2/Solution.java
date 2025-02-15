package com.algorithm.codingtest.programmers.lv0.최댓값만들기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int size = numbers.length;
        Arrays.sort(numbers);
        if (numbers[0] * numbers[1] >= numbers[size -2] * numbers[size - 1]) {
            return numbers[0] * numbers[1];
        } else {
            return numbers[size -2] * numbers[size - 1];
        }
    }
}

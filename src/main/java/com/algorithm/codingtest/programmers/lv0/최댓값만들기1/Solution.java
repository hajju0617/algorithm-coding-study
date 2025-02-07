package com.algorithm.codingtest.programmers.lv0.최댓값만들기1;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);       // 오름차순 정렬.
        int n = numbers.length;
        return numbers[n - 1] * numbers[n - 2];

        // n 선언하지말고 length 값을 이용하면 더 좋았을듯.
    }
}

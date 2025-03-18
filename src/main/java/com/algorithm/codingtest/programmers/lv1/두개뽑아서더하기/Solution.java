package com.algorithm.codingtest.programmers.lv1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        int[] numArr = new int[list.size()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        Arrays.sort(numArr);
        return numArr;
    }
}

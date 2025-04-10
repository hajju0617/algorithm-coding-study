package com.algorithm.codingtest.programmers.lv0.배열의길이를2의거듭제곱으로만들기;

import java.util.*;
public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = 1;
        while (tmp < arr.length) {
            tmp *= 2;
        }
        for (int num : arr) {
            list.add(num);
        }
        for (int i = list.size(); i < tmp; i++) {
            list.add(0);
        }
        int[] numArr = new int[list.size()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        return numArr;
    }
}

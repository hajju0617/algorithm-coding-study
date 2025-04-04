package com.algorithm.codingtest.programmers.lv0.배열만들기5;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (num > k) {
                list.add(num);
            }
        }
        int[] numArr = new int[list.size()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        return numArr;
    }
}

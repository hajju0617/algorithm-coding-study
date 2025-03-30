package com.algorithm.codingtest.programmers.lv1.명예의전당1;

import java.util.*;
public class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] numArr = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);
            if (list.size() > k) {
                list.remove(0);
            }
            numArr[i] = list.get(0);
        }
        return numArr;
    }
}

package com.algorithm.codingtest.programmers.lv0.무작위로K개의수뽑기;

import java.util.*;
public class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = k;
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        if (list.size() < k) {
            for (int i = 0; i < count; i++) {
                list.add(-1);
            }
        }
        int[] numArr = new int[list.size()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        return numArr;
    }
}

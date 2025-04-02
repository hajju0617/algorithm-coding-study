package com.algorithm.codingtest.programmers.lv0.빈배열에추가삭제하기;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        int[] numArr = new int[list.size()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        return numArr;
    }
}

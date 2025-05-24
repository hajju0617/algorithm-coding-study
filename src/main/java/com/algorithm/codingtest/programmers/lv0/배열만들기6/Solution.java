package com.algorithm.codingtest.programmers.lv0.배열만들기6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else if (list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
            } else {
                list.add(arr[i]);
            }
            i++;
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        int[] numArr = new int[list.size()];
        for (i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        return numArr;
    }
}

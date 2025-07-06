package com.algorithm.codingtest.programmers.lv0.배열만들기4;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (list.isEmpty() || list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            }  else {
                list.remove(list.size() - 1);
            }
        }

        int[] numArr = new int[list.size()];
        for (i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        return numArr;
    }
}

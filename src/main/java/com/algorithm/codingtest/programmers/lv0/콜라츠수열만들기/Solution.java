package com.algorithm.codingtest.programmers.lv0.콜라츠수열만들기;

import java.util.ArrayList;


public class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            numList.add(n);
        }
        int[] numArr = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            numArr[i] = numList.get(i);
        }
        return numArr;
    }
}

package com.algorithm.codingtest.programmers.lv0.소인수분해;

import java.util.*;
public class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
                n /= i;
            }
        }
        Collections.sort(list);

        int[] numArr = new int[list.size()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = list.get(i);
        }
        return numArr;
    }
}

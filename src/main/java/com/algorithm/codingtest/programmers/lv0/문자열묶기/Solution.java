package com.algorithm.codingtest.programmers.lv0.문자열묶기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String[] strArr) {
        List<Integer> countList = new ArrayList<>();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            countList.add(0);
        }
        for (int i = 0; i < length; i++) {
            int len = strArr[i].length();
            countList.set(len, countList.get(len) + 1);
        }

        int max = 0;
        for (int i = 1; i < length; i++) {
            if (countList.get(i) > max) max = countList.get(i);
        }
        return max;
    }
}

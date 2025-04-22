package com.algorithm.codingtest.programmers.lv1.기사단원의무기;

import java.util.*;
public class Solution {
    public int solution(int number, int limit, int power) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count += (j * j == i) ? 1 : 2;
                }
            }
            list.add(count);
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > limit) {
                list.set(i, power);
            }
            sum += list.get(i);
        }
        return sum;
    }
}

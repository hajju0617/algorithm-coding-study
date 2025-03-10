package com.algorithm.codingtest.programmers.lv1.삼진법뒤집기;

import java.util.ArrayList;

public class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }
        int sum = 0, power = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i) * Math.pow(3, power);
            power--;
        }
        return sum;
    }
}

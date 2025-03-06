package com.algorithm.codingtest.programmers.lv1.부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        return sum <= money ? 0 : sum - money;
    }
}

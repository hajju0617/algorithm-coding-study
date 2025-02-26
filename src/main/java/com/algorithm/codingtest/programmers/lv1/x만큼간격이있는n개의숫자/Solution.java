package com.algorithm.codingtest.programmers.lv1.x만큼간격이있는n개의숫자;

public class Solution {
    public long[] solution(int x, int n) {
        long[] longArr = new long[n];
        int count = 0;
        for (int i = 1; i <= longArr.length; i++) {
            longArr[count++] = (long) x * i;
        }
        return longArr;
    }
}

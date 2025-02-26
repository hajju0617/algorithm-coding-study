package com.algorithm.codingtest.programmers.lv1.자연수뒤집어배열로만들기;

public class Solution {
    public int[] solution(long n) {
        int count = 0;
        long num = n;

        while (num > 0) {
            count++;
            num /= 10;
        }

        int[] intArr = new int[count];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (n % 10);
            n /= 10;
        }
        return intArr;
    }
}

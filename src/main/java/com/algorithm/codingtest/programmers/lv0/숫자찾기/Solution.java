package com.algorithm.codingtest.programmers.lv0.숫자찾기;

public class Solution {
    public int solution(int num, int k) {
        String numString = String.valueOf(num);
        String kString = String.valueOf(k);

        return (!numString.contains(kString)) ? -1 : numString.indexOf(kString) + 1;
    }
}

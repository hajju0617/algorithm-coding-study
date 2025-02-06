package com.algorithm.codingtest.programmers.lv0.피자나눠먹기3;

public class Solution {
    public int solution(int slice, int n) {
        if (n % slice == 0) {
            return (n / slice);
        } else {
            return (n / slice) + 1;
        }
    }
}

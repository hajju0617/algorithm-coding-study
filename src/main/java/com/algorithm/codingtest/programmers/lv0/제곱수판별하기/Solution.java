package com.algorithm.codingtest.programmers.lv0.제곱수판별하기;

public class Solution {
    public int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
    // Math.sqrt 는 제곱근을 구하는 메서드. (반환값은 double)
}

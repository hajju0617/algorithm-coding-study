package com.algorithm.codingtest.programmers.lv0.더크게합치기;

public class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        // ("" + a + b) 이렇게 하면 될텐데 막상 사용할 때 기억이 안 나네..

        return (ab >= ba) ? ab : ba;
    }
}

package com.algorithm.codingtest.programmers.lv0.개미군단;

public class Solution {
    public int solution(int hp) {
        return (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
    }
}

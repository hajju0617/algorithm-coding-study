package com.algorithm.codingtest.programmers.lv1.수박수박수박수박수박수;

public class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }
        return sb.toString();
    }
}

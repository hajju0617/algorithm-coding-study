package com.algorithm.codingtest.programmers.lv1.카드뭉치;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0, b = 0, c = 0;
        while (c < goal.length) {
            if (a < cards1.length && cards1[a].equals(goal[c])) {
                a++;
            } else if (b < cards2.length && cards2[b].equals(goal[c])) {
                b++;
            } else {
                return "No";
            }
            c++;
        }
        return "Yes";
    }
}

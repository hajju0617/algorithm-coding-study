package com.algorithm.codingtest.programmers.lv1.이천십육년;

public class Solution {
    public String solution(int a, int b) {
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] lastDayOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int startDay = 0, totalDays = 0;

        for (int i = 0; i < a - 1; i++) {
            totalDays += lastDayOfMonth[i];
        }
        totalDays += startDay + b - 1;
        return week[totalDays % 7];
    }
}

package com.algorithm.codingtest.programmers.lv1.서울에서김서방찾기;

public class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}

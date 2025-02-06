package com.algorithm.codingtest.programmers.lv0.배열원소의길이;

public class Solution {
    public int[] solution(String[] strList) {
        int[] answer = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }
        return answer;
    }
}

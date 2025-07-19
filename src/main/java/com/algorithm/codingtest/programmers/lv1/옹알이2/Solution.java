package com.algorithm.codingtest.programmers.lv1.옹알이2;

public class Solution {
    public static void main(String[] args) {
        String[] str = {"yayae"};
        System.out.println(solution(str));
    }
    public static int solution(String[] babbling) {
        String[] canSpeak = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String word : babbling) {
            String temp = word;

            for (String speak : canSpeak) {
                if (temp.contains(speak + speak)) {
                    temp = "false";
                    break;
                }
                temp = temp.replace(speak, "*");
            }
            if (temp.replace("*", "").isEmpty()) {
                count++;
            }
        }
        return count;
    }
}

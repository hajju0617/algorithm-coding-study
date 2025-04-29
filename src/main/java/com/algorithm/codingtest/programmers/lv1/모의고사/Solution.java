package com.algorithm.codingtest.programmers.lv1.모의고사;

public class Solution {
    public int[] solution(int[] answers) {
        int[] firstPerson = {1, 2, 3, 4, 5};
        int[] secondPerson = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPerson = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] ranking = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstPerson[i % firstPerson.length]) {
                ranking[0]++;
            }
            if (answers[i] == secondPerson[i % secondPerson.length]) {
                ranking[1]++;
            }
            if (answers[i] == thirdPerson[i % thirdPerson.length]) {
                ranking[2]++;
            }
        }
        int maxNum = Math.max(ranking[0], Math.max(ranking[1], ranking[2]));
        int count = 0;
        for (int i = 0; i < ranking.length; i++) {
            if (ranking[i] == maxNum) {
                count++;
            }
        }
        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < ranking.length; i++) {
            if (ranking[i] == maxNum) {
                result[count++] = i + 1;
            }
        }
        return result;
    }
}

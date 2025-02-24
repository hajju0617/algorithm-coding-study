package com.algorithm.codingtest.programmers.lv0.할일목록;

public class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;

        for (boolean tmp : finished) {
            if (!tmp) {
                count++;
            }
        }
        String[] result = new String[count];
        count = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!(finished[i])) {
                result[count++] = todo_list[i];
            }
        }
        return result;
    }
}

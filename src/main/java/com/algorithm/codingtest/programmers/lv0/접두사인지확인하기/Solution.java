package com.algorithm.codingtest.programmers.lv0.접두사인지확인하기;

public class Solution {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public int solution2(String my_string, String is_prefix) {
        int answer = 0;
        int k = 1;
        String[] str =new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            str[i] = my_string.substring(0, k);
            k++;
        }
        for (int i = 0; i<my_string.length(); i++) {
            if (str[i].equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

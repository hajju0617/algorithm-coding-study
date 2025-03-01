package com.algorithm.codingtest.programmers.lv0.접미사인지확인하기;

public class Solution {
    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
    public int solution2(String my_string, String is_suffix) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(is_suffix.equals(my_string.substring(i))){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

package com.algorithm.codingtest.programmers.lv0.모음제거;

public class Solution {
    public String solution(String my_string) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String str : vowels) {
            my_string = my_string.replaceAll(str, "");
        }
        return my_string;
    }
}

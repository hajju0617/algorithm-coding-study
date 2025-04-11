package com.algorithm.codingtest.programmers.lv0.문자열이몇번등장하는지세기;

public class Solution {
    public int solution(String myString, String pat) {
        int count = 0, index = 0;

        while (index <= (myString.length() - pat.length())) {
            if (myString.substring(index, index + pat.length()).equals(pat)) {
                // myString.startsWith(pat, index) 로 할 수도 있음. (찾고자 하는 문자열, 인덱스)
                count++;
            }
            index++;
        }
        return count;
    }
}

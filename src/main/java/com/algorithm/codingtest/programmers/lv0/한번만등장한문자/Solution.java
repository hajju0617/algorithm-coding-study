package com.algorithm.codingtest.programmers.lv0.한번만등장한문자;

public class Solution {
    public String solution(String s) {
        int[] numArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            numArr[s.charAt(i) - 'a']++;        // s.charAt(i) - 'a' : 알파벳 순서. (Ex. a - 'a' = 0 -> numArr[0]++;)
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 1) {
                sb.append((char)(i + 'a'));     // i + 'a' : 알파벳 순서.
            }
        }
        return sb.toString();
    }
}

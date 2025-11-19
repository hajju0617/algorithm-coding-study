package com.algorithm.codingtest.programmers.lv1.둘만의암호;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder(s.length());
        ArrayList<Character> skipArr = new ArrayList<>();
        for (char c : skip.toCharArray()) {
            skipArr.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            while (count < index) {
                ch++;
                if (ch > 'z') {
                    ch = 'a';
                }
                if (skipArr.contains(ch)) {
                    continue;
                } else {
                    count++;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}

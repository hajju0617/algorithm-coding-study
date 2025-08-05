package com.algorithm.codingtest.programmers.lv0.외계어사전;

public class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            String word = dic[i];
            if (word.length() != spell.length) {
                continue;
            }

            boolean[] boolArr = new boolean[spell.length];
            boolean isFullMatch = true;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                boolean isCharMatch = false;

                for (int k = 0; k < spell.length; k++) {
                    if (!boolArr[k] && (spell[k].charAt(0) == c)) {
                        boolArr[k] = true;
                        isCharMatch = true;
                        break;
                    }
                }
                if (!isCharMatch) {
                    isFullMatch = false;
                    break;
                }
            }
            if (isFullMatch) {
                return 1;
            }
        }
        return 2;
    }
}

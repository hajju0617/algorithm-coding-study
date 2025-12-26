package com.algorithm.codingtest.programmers.lv1.대충만든자판;

import java.util.*;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> keyCnt = new HashMap<>();
        for (String str : keymap) {
            for (int i = 0; i < str.length(); i++) {
                char key = str.charAt(i);
                int count = i + 1;
                if (!keyCnt.containsKey(key) || count < keyCnt.get(key)) {
                    keyCnt.put(key, count);
                }
            }
        }
        int[] result = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int totalCnt = 0;
            String target = targets[i];
            for (int j = 0; j < target.length(); j++) {
                char key = target.charAt(j);
                if (keyCnt.containsKey(key)) {
                    totalCnt += keyCnt.get(key);
                } else {
                    totalCnt = -1;
                    break;
                }
            }
            result[i] = totalCnt;
        }
        return result;
    }
}

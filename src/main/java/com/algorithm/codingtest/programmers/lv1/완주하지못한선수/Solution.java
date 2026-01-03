package com.algorithm.codingtest.programmers.lv1.완주하지못한선수;

import java.util.*;
public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> count = new HashMap<>();
        for (String player : participant) {
            if (count.containsKey(player)) {
                count.put(player, count.get(player) + 1);
            } else {
                count.put(player, 1);
            }
        }
        for (String player : completion) {
            count.put(player, count.get(player) - 1);
        }
        String result = "";
        for (String player : count.keySet()) {
            if (count.get(player) != 0) {
                result = player;
                break;
            }
        }
        return result;
    }
}

package com.algorithm.codingtest.programmers.lv1.로또의최고순위와최저순위;

import java.util.*;
public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        if (Arrays.equals(lottos, win_nums)) {
            return new int[] {1, 1};
        }
        int zeroCount = 0, equalCount = 0;
        for (int l : lottos) {
            if (l == 0) {
                zeroCount++;
                continue;
            }
            for (int w : win_nums) {
                if (l == w) {
                    equalCount++;
                }
            }
        }
        return new int[] {getRank(zeroCount + equalCount), getRank(equalCount)};
    }
    private int getRank(int num) {
        return num >= 2 ? 7 - num : 6;
    }
}

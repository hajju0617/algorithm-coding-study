package com.algorithm.codingtest.programmers.lv1.체육복;

import java.util.*;
public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int hasUniform = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);


        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    hasUniform++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int l : lost) {
            if (l == -1) {
                continue;
            }
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] == l - 1 || reserve[i] == l + 1) {
                    hasUniform++;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        return hasUniform;
    }
}

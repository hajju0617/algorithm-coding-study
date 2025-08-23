package com.algorithm.codingtest.programmers.lv0.전국대회선발고사;

import java.util.*;
public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < rank.length; i++) {
            if(list.get(0) == rank[i]){
                a = i;
            }
            if(list.get(1) == rank[i]){
                b = i;

            }
            if(list.get(2) == rank[i]){
                c = i;
            }
        }
        return 10000 * a + 100 * b + c;
    }
}

package com.algorithm.codingtest.programmers.lv1.폰켓몬;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        return Math.min(hashSet.size(), nums.length / 2);
    }
}

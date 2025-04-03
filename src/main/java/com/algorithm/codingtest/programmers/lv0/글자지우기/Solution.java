package com.algorithm.codingtest.programmers.lv0.글자지우기;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = indices.length -1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }
        return sb.toString();
    }
}

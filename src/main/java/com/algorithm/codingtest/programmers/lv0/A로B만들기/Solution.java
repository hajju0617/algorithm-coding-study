package com.algorithm.codingtest.programmers.lv0.A로B만들기;

import java.util.Arrays;

public class Solution {
    public int solution(String before, String after) {
        char[] beforeChArr = before.toCharArray();
        char[] afterChArr = after.toCharArray();

        Arrays.sort(beforeChArr);
        Arrays.sort(afterChArr);
        String bf = new String(beforeChArr);
        String af = new String(afterChArr);
        return bf.equals(af) ? 1 : 0;
    }
}

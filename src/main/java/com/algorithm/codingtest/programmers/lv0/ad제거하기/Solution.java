package com.algorithm.codingtest.programmers.lv0.ad제거하기;

import java.util.ArrayList;

public class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].indexOf("ad") == -1) {
                list.add(strArr[i]);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

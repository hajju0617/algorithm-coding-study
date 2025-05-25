package com.algorithm.codingtest.programmers.lv0.왼쪽오른쪽;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] str_list) {
        String[] strArr = null;
        for (int i = 0; i < str_list.length; i++) {
            if ("l".equals(str_list[i])) {
                strArr = new String[i];
                for (int j = 0; j < strArr.length; j++) {
                    strArr[j] = str_list[j];
                }
                return strArr;
            } else if ("r".equals(str_list[i])) {
                strArr = new String[str_list.length - i - 1];
                for (int j = i + 1; j < str_list.length; j++) {
                    strArr[j - i - 1] = str_list[j];
                }
                return strArr;
            }
        }
        return new String[]{};
    }
}

package com.algorithm.codingtest.programmers.lv0.그림확대;

import java.util.*;

public class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> strList = new ArrayList<>();

        for (String row : picture) {
            StringBuilder Row = new StringBuilder();
            for (char ch : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    Row.append(ch);
                }
            }

            String column = Row.toString();
            for (int i = 0; i < k; i++) {
                strList.add(column);
            }
        }

        return strList.toArray(new String[0]);
    }
}

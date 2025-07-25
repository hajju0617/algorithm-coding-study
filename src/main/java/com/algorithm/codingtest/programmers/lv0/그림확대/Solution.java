package com.algorithm.codingtest.programmers.lv0.그림확대;

import java.util.*;

public class Solution {
        public String[] solution(String[] picture, int k) {
            List<String> strList = new ArrayList<>();

            for (int i = 0; i < picture.length; i++) {
                char[] chArr = picture[i].toCharArray();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < chArr.length; j++) {
                    char ch = chArr[j];
                    for (int l = 0; l < k; l++) {           // 가로 확대.
                        sb.append(ch);
                    }
                }
                String vertical = sb.toString();
                for (int m = 0; m < k; m++) {               // 세로 확대.
                    strList.add(vertical);
                }
            }
            return strList.toArray(new String[0]);
        }
}

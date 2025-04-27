package com.algorithm.codingtest.programmers.lv0.세개의구분자;

import java.util.*;
public class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == 'b' || myStr.charAt(i) == 'a' || myStr.charAt(i) == 'c') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(myStr.charAt(i));
            }
        }
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }
}

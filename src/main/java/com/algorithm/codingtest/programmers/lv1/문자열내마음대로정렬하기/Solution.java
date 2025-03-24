package com.algorithm.codingtest.programmers.lv1.문자열내마음대로정렬하기;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            strList.add(strings[i].charAt(n) + "-" + strings[i]);
        }
        Collections.sort(strList);
        String[] strArr = new String[strList.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strList.get(i).split("-")[1];
        }
        return strArr;
    }
}

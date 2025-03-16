package com.algorithm.codingtest.programmers.lv0.x사이의개수;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static int[] solution(String myString) {
        String[] strArr = myString.split("x", -1);
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = strArr[i].length();
        }
        return numArr;
    }
    public static int[] solution2(String myString) {
        char[] chArr = myString.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (char ch : chArr) {
            if ('x' == ch) {
                list.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        list.add(count);

        int[] numArr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            numArr[i] = list.get(i);
        }

        return numArr;
    }
}

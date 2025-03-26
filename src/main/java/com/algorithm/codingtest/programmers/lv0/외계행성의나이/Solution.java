package com.algorithm.codingtest.programmers.lv0.외계행성의나이;

public class Solution {
    public String solution(int age) {
        String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();
        String tmp = String.valueOf(age);

        for (char ch : tmp.toCharArray()) {
            int num = ch - '0';
            sb.append(strArr[num]);
        }
        return sb.toString();
    }
    public String solution2(int age) {
        String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        String result = "";
        while (age > 0) {
            result = strArr[age % 10] + result;
            age /= 10;
        }
        return result;
    }
}

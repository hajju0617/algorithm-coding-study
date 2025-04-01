package com.algorithm.codingtest.programmers.lv1.일차비밀지도;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            String map1 = Integer.toBinaryString(arr1[i]);
            String map2 = Integer.toBinaryString(arr2[i]);
            map1 = "0".repeat(n - map1.length()) + map1;
            map2 = "0".repeat(n - map2.length()) + map2;
            char[] map1ChArr = map1.toCharArray();
            char[] map2ChArr = map2.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (map1ChArr[j] == '1' || map2ChArr[j] == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            strArr[i] = sb.toString();
        }
        return strArr;
    }
}

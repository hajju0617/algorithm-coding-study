package com.algorithm.codingtest.programmers.lv0.x사이의개수;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        // -1: 모든 분할을 수행 (빈 문자열 유지)
        System.out.println(Arrays.toString(myString.split("x", -1)));
        System.out.println(Arrays.toString(solution3(myString)));
// 결과: [a, b, cd, , e]

// 0: 기본 동작 (빈 문자열 제거)
        System.out.println(Arrays.toString(myString.split("x", 0)));
        System.out.println(Arrays.toString(solution(myString)));
// 결과: [a, b, cd, e]

// 3: 최대 3개의 요소로 분할
        System.out.println(Arrays.toString(myString.split("x", 3)));
        System.out.println(Arrays.toString(solution(myString)));
// 결과: [a, b, cdxxe]
    }
    public static int[] solution(String myString) {
        String[] strArr = myString.split("x", 0);
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = strArr[i].length();
        }
        return numArr;
    }
    public static int[] solution3(String myString) {
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

package com.algorithm.codingtest.programmers.lv1.이상한문자만들기;

public class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ", -1);     // -1의 의미 : 문자 뒤에 공백이 있을 경우 그 공백도 포함시킴.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            char[] chArr = strArr[i].toCharArray();
            for (int j = 0; j < chArr.length; j++) {
                if (j % 2 == 1) {
                    chArr[j] = Character.toLowerCase(chArr[j]);
                } else {
                    chArr[j] = Character.toUpperCase(chArr[j]);
                }
            }
            sb.append(new String(chArr));
            if (i != strArr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

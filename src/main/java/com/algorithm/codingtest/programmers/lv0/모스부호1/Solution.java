package com.algorithm.codingtest.programmers.lv0.모스부호1;

public class Solution {
    public String solution(String letter) {
        String[] strArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--."
                ,"....","..",".---","-.-",".-..","--","-.","---",".--."
                ,"--.-",".-.","...","-","..-","...-",".--","-..-","-.--"
                ,"--.."};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (strArr[i].equals(morse[j])) {
                    sb.append((char) ('a' + j));
                    break;
                }
            }
        }
        return sb.toString();
    }
}

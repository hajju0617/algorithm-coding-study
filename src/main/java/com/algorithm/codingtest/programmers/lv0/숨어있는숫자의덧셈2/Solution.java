package com.algorithm.codingtest.programmers.lv0.숨어있는숫자의덧셈2;

public class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split("\\D+");  // 자르는 기준 : 숫자가 아닌 문자 1개 이상
                                        // Ex) "aAb1B2cC34oOp" ==> ["", "1", "2", "34"]
        int sum = 0;
        for (String str : strArr) {
            if (!str.isEmpty()) {
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }
}

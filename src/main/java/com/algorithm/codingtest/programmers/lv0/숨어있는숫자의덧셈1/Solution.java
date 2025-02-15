package com.algorithm.codingtest.programmers.lv0.숨어있는숫자의덧셈1;

public class Solution {
    public int solution(String my_string) {
        char[] numArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int answer = 0;
        for (int n : my_string.toCharArray()) {
            for (int i = 0; i < numArr.length; i++) {
                if (n == numArr[i]) {
                    answer += n - '0';
                           // Character.getNumericValue(n)로 대체 가능.
                }
            }
        }
        return answer;
    }
}

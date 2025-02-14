package com.algorithm.codingtest.programmers.lv0.옷가게할인받기;

public class Solution {
    public int solution(int price) {
        if (price < 100000) {
            return price;
        } else if (price < 300000) {
            return (int) (price * 0.95);
        } else if (price < 500000) {
            return (int) (price * 0.9);
        } else {
            return (int) (price * 0.8);
        }
    }
}

package com.algorithm.codingtest.programmers.lv0.배열비교하기;

public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int length1 = arr1.length, length2 = arr2.length;
        int sum1 = 0, sum2 = 0;
        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }
        if (length1 != length2) {
            return length1 > length2 ? 1 : -1;
        } else {
            return sum1 == sum2 ? 0 : (sum1 > sum2) ? 1 : -1;
        }
    }
}

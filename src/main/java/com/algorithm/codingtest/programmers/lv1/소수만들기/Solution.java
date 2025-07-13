package com.algorithm.codingtest.programmers.lv1.소수만들기;

public class Solution {
    public int solution(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean prime = true;

                    if (sum < 2) {
                        prime = false;
                    } else {
                        for (int l = 2; l * l <= sum; l++) {
                            if (sum % l == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }
                    if (prime) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

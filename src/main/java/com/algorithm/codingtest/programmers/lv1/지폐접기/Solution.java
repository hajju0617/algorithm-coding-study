package com.algorithm.codingtest.programmers.lv1.지폐접기;

public class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;

        if (wallet[0] > wallet[1]) {
            int tmp = wallet[0];
            wallet[0] = wallet[1];
            wallet[1] = tmp;
        }
        fold(bill);

        while (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            bill[1] = (int) (bill[1] / 2);
            fold(bill);
            count++;
        }
        return count;
    }

    private void fold(int[] intArr) {
        if (intArr[0] > intArr[1]) {
            int tmp = intArr[0];
            intArr[0] = intArr[1];
            intArr[1] = tmp;
        }
    }
}

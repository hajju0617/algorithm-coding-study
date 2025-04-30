package com.algorithm.codingtest.programmers.lv0.리스트자르기;

import java.util.*;
public class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch (n) {
            case 1 : return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2 : return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 : return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            default : {
                int size = ((slicer[1] - slicer[0]) / slicer[2]) + 1;
                int[] numArr = new int[size];
                int index = 0;
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    numArr[index++] = num_list[i];
                }
                return numArr;
            }
        }
    }
}

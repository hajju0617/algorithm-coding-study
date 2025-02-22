package com.algorithm.codingtest.programmers.lv0;

import java.util.Arrays;

public class tmp {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};  // 12자리 배열
        int[] query = {8, 3, 6, 2, 5};  // 다양한 값을 포함한 쿼리

        int[] result = solution(arr, query);
        System.out.println(Arrays.toString(result));
    }
    public static int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ", arr = " + Arrays.toString(arr));
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);  // query[i]까지 유지
                System.out.println(i + ", arr = " + Arrays.toString(arr));
                System.out.println("-------------------");
            } else {
                System.out.println(i + ", arr = " + Arrays.toString(arr));
                arr = Arrays.copyOfRange(arr, query[i], arr.length);  // query[i]부터 유지
                System.out.println(i + ", arr = " + Arrays.toString(arr));
                System.out.println("-------------------");
            }
        }
        return arr;
    }


}

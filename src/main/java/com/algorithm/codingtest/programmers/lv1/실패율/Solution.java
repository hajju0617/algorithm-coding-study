package com.algorithm.codingtest.programmers.lv1.실패율;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stay = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            stay[stages[i]]++;
        }

        int total = stages.length;
        double[][] arr = new double[N][2];
        // arr[i][0] = stage 번호
        // arr[i][1] = 실패율

        for (int i = 1; i <= N; i++) {
            double rate = 0.0;
            if (total > 0) {
                rate = (double) stay[i] / total;
            }
            arr[i - 1][0] = i;
            arr[i - 1][1] = rate;
            total -= stay[i];
        }

        // 버블 정렬.
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j][1] < arr[j + 1][1]) {
                    double[] tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                // 실패율 같을 경우.
                else if (arr[j][1] == arr[j + 1][1]) {
                    if (arr[j][0] > arr[j + 1][0]) {
                        double[] tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = (int) arr[i][0];
        }
        return result;
    }
}

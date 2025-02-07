package com.algorithm.codingtest.programmers.lv0.평행;

public class Solution {
    public int solution(int[][] dots) {

        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int x3 = dots[2][0];
        int x4 = dots[3][0];
        int y1 = dots[0][1];
        int y2 = dots[1][1];
        int y3 = dots[2][1];
        int y4 = dots[3][1];

        double slope1 = (double) (y1 - y4) / (x1 - x4);
        double slope2 = (double) (y2 - y3) / (x2 - x3);
        double slope3 = (double) (y1 - y3) / (x1 - x3);
        double slope4 = (double) (y2 - y4) / (x2 - x4);
        double slope5 = (double) (y1 - y2) / (x1 - x2);
        double slope6 = (double) (y3 - y4) / (x3 - x4);

        if ((slope1 == slope2) || (slope3 == slope4) || (slope5 == slope6)) {
            return 1;
        }
        return 0;
    }

    /*
        class Solution {
        public int solution(int[][] dots) {
            int answer = 0, count = 0;
            double[] saved = new double[6];
            for (int i = 0; i < dots.length - 1; i++) {
                for (int j = i + 1; j < dots.length; j++) {
                    double slope = (dots[j][1] - dots[i][1]) / (dots[j][0] - dots[i][0]);
                    saved[count++] = slope;
                }
            }
            for (int i = 0; i < saved.length - 1; i++) {
                for (int j = i + 1; j < saved.length; j++) {
                    if (saved[i] == saved[j]) {
                        return 1;
                    }
                }
            }
            return answer;
         }
       }
       테스트 12번부터 막힘.
     */
}

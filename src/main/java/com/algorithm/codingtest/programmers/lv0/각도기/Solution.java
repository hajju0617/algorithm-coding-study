package com.algorithm.codingtest.programmers.lv0.각도기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();
        System.out.println(solution(angle));
    }

    public static int solution(int angle) {
        if (0 < angle && angle < 90) {              // 예각
            return 1;
        } else if (angle == 90) {                   // 직각
            return 2;
        } else if (90 < angle && angle < 180) {     // 둔각
            return 3;
        } else {                                    // 평각
            return 4;
        }
    }
}

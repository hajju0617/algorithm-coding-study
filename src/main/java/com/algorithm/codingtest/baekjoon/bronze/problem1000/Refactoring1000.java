package com.algorithm.codingtest.baekjoon.bronze.problem1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Refactoring1000 {
    public static void main(String[] args) throws IOException {         // readLine() 예외처리.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        // bufferedReader.readLine() : 한 줄의 입력을 읽고, 그 줄을 String 형태로 반환.
        // StringTokenizer : readLine()으로 받은 문자열을 공백을 기준으로 단어별로 나누기 위해 사용. (Ex. "10 20" -> "10", "20"

        int a = Integer.parseInt(st.nextToken());       // st.nextToken() : StringTokenizer에서 다음 토큰(단어)을 하나씩 가져옴
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
    }
}


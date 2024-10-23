package com.algorithm.codingtest.programmers.lv0.옹알이;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static void main(String[] args) {

        // 테스트할 문자열 배열
        String[] babbling1 = {"aya"};

        String[] babbling2 = {"ayaye", "wooowoo", "mama"};

        String[] babbling3 = {"ayaaya", "ye", "woo", "ma"};

        String[] babbling4 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};


        System.out.println("babbling1 결과 : " + solution(babbling1));
        System.out.println("babbling2 결과 : " + solution(babbling2));
        System.out.println("babbling3 결과 : " + solution(babbling3));
        System.out.println("babbling4 결과 : " + solution(babbling4));

    }

    public static int solution(String[] babbling) {
        int num = 0;
        // 문자열 배열을 담을 리스트 생성
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < babbling.length; i++) {
            // 문자열 split으로 자름. 만약 이 안에 있는 원소로만 잘린다면 빈칸이 됨.
            String[] temp = babbling[i].split("aya|ye|woo|ma");
            list.add(temp);
        }


        for (int i = 0; i < list.size(); i++) {
            // 리스트 안의 문자열 배열의 빈칸의 갯수를 셈 (빈칸 == 모든 문자가 다 사라짐을 의미)
            if (list.get(i).length == 0) {
                num++;
            }
        }
        return num;
    }
}

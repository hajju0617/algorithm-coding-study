package com.algorithm.codingtest.programmers.lv0.커피심부름;

public class Solution {
    public static void main(String[] args) {
        String text = "Hello, world!";

        System.out.println(text.contains("world"));  // true
        System.out.println(text.contains("World"));  // false (대소문자 구분)
        System.out.println(text.contains("o, w"));   // true
        System.out.println(text.contains("world ")); // false (공백 구분)
    }
    public int solution(String[] order) {
        int sum = 0;
        for (int i = 0; i < order.length; i++) {
            char menu = order[i].charAt(3);
            char menu2 = order[i].charAt(0);
            if ("americano".equals(order[i]) || menu == 'a' || menu2 == 'a' || "anything".equals(order[i])) {
                sum += 4500;
            } else {
                sum += 5000;
            }
        }
        return sum;
    }
    public int solution2(String[] order) {
        int answer = 0;
        for(String o : order) {
            if(o.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}

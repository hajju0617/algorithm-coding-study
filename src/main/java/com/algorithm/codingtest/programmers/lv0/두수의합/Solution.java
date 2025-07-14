package com.algorithm.codingtest.programmers.lv0.두수의합;

import java.math.*;

public class Solution {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        return (numA.add(numB)).toString();
    }
}

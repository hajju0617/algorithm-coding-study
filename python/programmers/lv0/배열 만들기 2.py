# https://school.programmers.co.kr/learn/courses/30/lessons/181921?language=python3

def solution(l, r):
    result = [i for i in range(l, r + 1) if all(ch == '0' or ch == '5' for ch in str(i))]
    return result if result else [-1]

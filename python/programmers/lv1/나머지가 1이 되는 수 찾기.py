# https://school.programmers.co.kr/learn/courses/30/lessons/87389?language=python3

def solution(n):
    x = 1
    while True:
        if n % x == 1:
            return x
        x = x + 1
        
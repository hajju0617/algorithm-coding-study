# https://school.programmers.co.kr/learn/courses/30/lessons/181936?language=python3

def solution(number, n, m):
    return int(number % n == 0 and number % m == 0)
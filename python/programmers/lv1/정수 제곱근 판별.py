# https://school.programmers.co.kr/learn/courses/30/lessons/12934?language=python3

import math

def solution(n):
    num = 0
    num = int(math.sqrt(n))
    if (num * num == n):
        return int((num + 1) * (num + 1))
    return -1
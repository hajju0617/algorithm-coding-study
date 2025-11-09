# https://school.programmers.co.kr/learn/courses/30/lessons/12928?language=python3

def solution(n):
    result = 0
    num = 1
    while n >= num:
        if n % num == 0:
            result += num
        num += 1
    return result

def solution(n):
    result = 0
    for i in range(1, n + 1):
        if n % i == 0:
            result += i
    return result
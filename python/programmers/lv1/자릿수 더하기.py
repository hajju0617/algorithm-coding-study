# https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=python3

def solution(n):
    answer = str(n)
    result = 0
    for i in answer:
        result += int(i)
    return result
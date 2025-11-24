# https://school.programmers.co.kr/learn/courses/30/lessons/12910?language=python3

def solution(arr, divisor):
    result = []
    for e in arr:
        if e % divisor == 0:
            result.append(e)
    if not result:
        return [-1]
    else:
        return sorted(result)
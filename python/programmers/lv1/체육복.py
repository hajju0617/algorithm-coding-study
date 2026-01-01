# https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=python3

def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()
    has_uniform = n - len(lost)
    
    for i, l in enumerate(lost):
        for j, r in enumerate(reserve):
            if l == r:
                has_uniform += 1
                lost[i] = -1
                reserve[j] = -1
                break
    for i, l in enumerate(lost):
        if l == -1:
            continue
        for j, r in enumerate(reserve):
            if l == r-1 or l == r+1:
                has_uniform += 1
                reserve[j] = -1
                break
    return has_uniform
# https://school.programmers.co.kr/learn/courses/30/lessons/12947?language=python3

def solution(x):
    num = 0
    for i in str(x):
        num += int(i)
    if (x % num != 0):
        return False
    return True
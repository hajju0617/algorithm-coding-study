# https://school.programmers.co.kr/learn/courses/30/lessons/181939?language=python3

def solution(a, b):
    num_a = int(f'{a}{b}')
    num_b = int(f'{b}{a}')
    if (num_a >= num_b):
        return num_a
    else:
        return num_b
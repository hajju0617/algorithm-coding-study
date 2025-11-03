# https://school.programmers.co.kr/learn/courses/30/lessons/181938?language=python3

def solution(a, b):
    num_a = int(f'{a}{b}')
    num_b = 2 * a * b
    if num_a >= num_b:
        return num_a
    return num_b

# def solution(a, b):
#     return max(int(f'{a}{b}'), 2 * a * b)
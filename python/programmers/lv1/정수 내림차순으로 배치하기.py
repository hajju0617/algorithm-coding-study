# https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=python3

def solution(n):
    numbers = []
    while n > 0:
        numbers.append(n % 10)
        n //= 10
    numbers.sort(reverse=True)
    
    result = 0
    for i in numbers:
        result = result * 10 + i
    return result
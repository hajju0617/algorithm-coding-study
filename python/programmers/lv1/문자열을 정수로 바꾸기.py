# https://school.programmers.co.kr/learn/courses/30/lessons/12925?language=python3

def solution(s):
    digits = '0123456789'
    
    sign = 1
    if s[0] == '-':
        sign = -1
        s = s[1:]      
    elif s[0] == '+':
        s = s[1:]
        
    
    num = 0
    for i in s:
        digit = digits.index(i)
        num = num * 10 + digit
    return sign * num
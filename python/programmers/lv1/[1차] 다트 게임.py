# https://school.programmers.co.kr/learn/courses/30/lessons/17682?language=python3

def solution(dartResult):
    num = 0
    scores = []
    squares = {'S':1, 'D':2, 'T':3}
    
    for ch in dartResult:
        if ch.isdigit():
            num = num * 10 + int(ch)
        elif ch in squares:
            scores.append(num ** squares[ch])
            num = 0
        elif ch == '*':
            scores[-1] *= 2
            if len(scores) > 1:
                scores[-2] *= 2
        elif ch == '#':
            scores[-1] *= -1
    return sum(scores)
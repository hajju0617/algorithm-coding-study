# https://school.programmers.co.kr/learn/courses/30/lessons/140108?language=python3

def solution(s):
    count = 0
    same = 0
    diff = 0
    first_char = ''
    for ch in s:
        if not first_char:
            first_char = ch
            same += 1
        else:
            if ch == first_char:
                same += 1
            else:
                diff +=1
        if same == diff:
            count += 1
            first_char = ''
            same = 0
            diff = 0
    if first_char != '':
        count += 1
    return count
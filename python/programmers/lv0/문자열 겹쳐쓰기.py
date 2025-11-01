# https://school.programmers.co.kr/learn/courses/30/lessons/181943?language=python3

def solution(my_string, overwrite_string, s):
    answer = ""
    answer += my_string[:s]
    answer += overwrite_string
    if (len(my_string) - s) > len(overwrite_string):
        answer += my_string[s + len(overwrite_string):]
    return answer
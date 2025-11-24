# https://school.programmers.co.kr/learn/courses/30/lessons/181932?language=python3

def solution(code):
    mode = 0
    result = []

    for idx, ch in enumerate(code):
        if ch == '1':
            mode = 1 - mode
        else:
            if mode == 0 and idx % 2 == 0:
                result.append(ch)
            elif mode == 1 and idx % 2 == 1:
                result.append(ch)

    ret = ''.join(result)
    if ret:
        return ret
    else:
        return 'EMPTY'
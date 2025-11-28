# https://school.programmers.co.kr/learn/courses/30/lessons/120812?language=python3

def solution(array):
    dict_count = {}
    for e in array:
        # .get(e, 0) : key(e)가 존재한다면 해당 key(e)에 대한 value 반환. 존재하지 않는다면 기본값 0 반환.
        dict_count[e] = dict_count.get(e, 0) + 1
    max_value = max(dict_count.values())
    count, value = 0, 0
    for k, v in dict_count.items():
        if max_value == v:
            count += 1
            value = k
    return -1 if count > 1 else value
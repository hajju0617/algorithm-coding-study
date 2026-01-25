# https://school.programmers.co.kr/learn/courses/30/lessons/77484?language=python3

def solution(lottos, win_nums):
    zero_count = lottos.count(0)
    equal_count = len(set(lottos) & set(win_nums))
        
    get_rank = lambda x: 7 - x if x >= 2 else 6
    return [get_rank(zero_count + equal_count), get_rank(equal_count)]
# https://school.programmers.co.kr/learn/courses/30/lessons/160586

def solution(keymap, targets):
    result = []
    key_cnt_dict = {}
    
    for key in keymap:
        for i, char in enumerate(key):
            if char not in key_cnt_dict or key_cnt_dict[char] > i+1:
                key_cnt_dict[char] = i+1
    for target in targets:
        count = 0
        for char in target:
            if char in key_cnt_dict:
                count += key_cnt_dict[char]
            else:
                count = -1
                break
        result.append(count)
    return result
# https://school.programmers.co.kr/learn/courses/30/lessons/42889

def solution(N, stages):
    stay = [0] * (N+2)
    for i in stages:
        stay[i] += 1
    
    stage_info = []
    total = len(stages)
    
    for i in range(1, N+1):
        rate = 0
        if total > 0:
            rate = stay[i] / total
        stage_info.append([i, rate])
        total -= stay[i]

    '''
    1차 정렬 기준 : -x[1] (내림차순), 2차 정렬 기준 : x[0] (오름차순)
    Python에서는 기본값이 '오름차순'이므로 '-'를 붙여서 내림차순 구현.
    '''
    stage_info.sort(key=lambda x: (-x[1], x[0]))
    
    result = []
    for i in range(N):
        result.append(stage_info[i][0])
    return result
        
        
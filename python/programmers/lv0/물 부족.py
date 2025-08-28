def solution(storage, usage, change):
    total_usage = 0
    for i in range(len(change)):
        usage = (usage * change[i]/100) + usage
        total_usage += usage
        if total_usage > storage:
            return i
    
    return -1

# https://school.programmers.co.kr/learn/courses/30/lessons/340202
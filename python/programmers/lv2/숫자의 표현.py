# https://school.programmers.co.kr/learn/courses/30/lessons/12924?language=python3

def solution(n):
    if n == 1:
        return 1

    count, start, end, num_sum = 0, 1, 1, 1

    while start <= (n / 2):
        if num_sum == n:
            count += 1
        if num_sum >= n:
            num_sum -= start
            start += 1
        else:
            end += 1
            num_sum += end
    return count + 1
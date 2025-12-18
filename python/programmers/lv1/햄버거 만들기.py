# https://school.programmers.co.kr/learn/courses/30/lessons/133502

def solution(ingredient):
    count, burger_size = 0, 4
    burger_stack = []
    
    for i in ingredient:
        burger_stack.append(i)
        if i == 1 and len(burger_stack) >= burger_size:
            if burger_stack[-burger_size:] == [1, 2, 3, 1]:
                count += 1
                for _ in range(burger_size):
                    burger_stack.pop()
    return count
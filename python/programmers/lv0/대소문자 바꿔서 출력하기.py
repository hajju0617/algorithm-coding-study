# https://school.programmers.co.kr/learn/courses/30/lessons/181949?language=python3

str = input()
result = ""

for text in str:
    if text.islower():
        result += text.upper()
    else:
        result += text.lower()
print(result)
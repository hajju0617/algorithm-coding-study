# https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=python3

def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    player_dict = {}
    for name in participant:
        player_dict[name] = player_dict.get(name, 0) + 1
    for name in completion:
        player_dict[name] -= 1
    for name in player_dict:
        if player_dict[name] > 0:
            return name
        
def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    for i in range(len(completion)):
        if participant[i] != completion[i]:
            return participant[i]
    return participant[-1]
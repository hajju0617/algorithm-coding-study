# https://school.programmers.co.kr/learn/courses/30/lessons/250125?language=python3

def solution(board, h, w):
    count, boardWH = 0, len(board)
    mw, mh = [0, 0, -1, 1], [-1, 1, 0, 0]
    selected_color = board[h][w]
    
    for i in range(len(mw)):
        w_check, h_check = w + mw[i], h + mh[i]
        if 0 <= w_check < boardWH and 0 <= h_check < boardWH:
            if board[h_check][w_check] == selected_color:
                count += 1
    return count
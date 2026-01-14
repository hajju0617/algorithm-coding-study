def solution(s):
    count, removed_zero_count = 0, 0
    while s != '1':
        ones_list = [char for char in s if char != '0']
        zero_count = len(s) - len(ones_list)
        s = f'{len(ones_list):b}'
        removed_zero_count += zero_count
        count += 1
    return [count, removed_zero_count]
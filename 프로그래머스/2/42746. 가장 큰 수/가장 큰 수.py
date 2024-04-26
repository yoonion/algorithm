def solution(numbers):
    sorted_list = sorted(list(map(str, numbers)), key=lambda x: x*3, reverse=True)
    return str(int(''.join(sorted_list)))
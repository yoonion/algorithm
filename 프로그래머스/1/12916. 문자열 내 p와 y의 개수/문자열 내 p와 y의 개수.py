def solution(s):
    answer = True
    
    p_count = 0
    y_count = 0
    
    chars = list(s.lower())
    for char in chars:
        if char == 'p':
            p_count += 1
        elif char == 'y':
            y_count += 1
    
    if p_count != y_count:
        answer = False
    
    return answer
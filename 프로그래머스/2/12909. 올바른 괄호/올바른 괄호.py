def solution(s):
    answer = True
    
    stack = []
    for char in s:
        if char == '(':
            stack.append(char)
        else:
            if not stack:
                answer = False
                break
            stack.pop()
    
    if stack:
        answer = False
    
    return answer
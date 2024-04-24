def solution(array, commands):
    
    answer = []    
    for command in commands:
        i = command[0]
        j = command[1]
        k = command[2]
    
        answer.append(sorted(array[i-1:j])[k-1])
    return answer
        
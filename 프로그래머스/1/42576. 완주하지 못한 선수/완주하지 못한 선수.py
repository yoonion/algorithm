def solution(participant, completion):
    
    dic = {}
    for runner in participant:
        if runner not in dic:
            dic[runner] = 1
        else:
            dic[runner] += 1
            
    for finisher in completion:
        if dic[finisher] == 1:
            del dic[finisher]
        elif dic[finisher] > 1:
            dic[finisher] -= 1
    
    return list(dic.keys())[0]
    
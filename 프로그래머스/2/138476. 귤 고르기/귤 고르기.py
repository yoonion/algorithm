def solution(k, tangerine):
    
    dic = {}
    for num in tangerine:
        if num not in dic:
            dic[num] = 1
        else:
            dic[num] += 1
    
    sorted_dic = dict(sorted(dic.items(), key=lambda x:x[1], reverse=True))
    
    answer = 0
    for count in sorted_dic.values():
        answer += 1
        k -= count
        if k <= 0:
            break;
            
    return answer
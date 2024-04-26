def solution(answers):
    
    one = [1,2,3,4,5]
    two = [2,1,2,3,2,4,2,5]
    three = [3,3,1,1,2,2,4,4,5,5]
    scores = [0,0,0]
    result = []
    for i in range(len(answers)):
        answer = answers[i]
        if one[i % len(one)] == answer:
            scores[0] += 1
        
        if two[i % len(two)] == answer:
            scores[1] += 1
            
        if three[i % len(three)] == answer:
            scores[2] += 1
            
    for i in range(3):
        if scores[i] == max(scores):
            result.append(i+1)
    
    return result
        
            
        
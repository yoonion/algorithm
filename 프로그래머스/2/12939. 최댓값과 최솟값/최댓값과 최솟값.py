def solution(s):
    answer = ''
    
    nums = list(map(int, s.split()))
    
    min_num = min(nums)
    max_num = max(nums)
    
    answer = str(min_num) + " " + str(max_num)
    
    return answer
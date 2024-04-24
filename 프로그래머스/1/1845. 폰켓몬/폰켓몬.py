def solution(nums):
    
    limit = len(nums) / 2
    
    pockets = set()
    for num in nums:
        pockets.add(num)
    
    total_count = len(pockets)
    if len(pockets) >= limit:
        return limit
    else:
        return total_count
        
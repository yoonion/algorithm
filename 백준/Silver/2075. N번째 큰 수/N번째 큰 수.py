import heapq

N = int(input())

nums = []
for _ in range(N):
    for num in map(int, input().split()):
        if len(nums) < N:
            heapq.heappush(nums, num)
        else:
            heapq.heappushpop(nums, num)
print(nums[0])
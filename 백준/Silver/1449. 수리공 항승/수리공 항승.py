N, L = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()

start = nums[0]
answer = 1
for num in nums:
    if num >= start + L:
        answer += 1
        start = num
print(answer)
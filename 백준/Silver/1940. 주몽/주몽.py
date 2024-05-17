N = int(input())
M = int(input())
nums = list(map(int, input().split()))
nums.sort()

left = 0
right = len(nums) - 1
count = 0
while left < right:
    sum = nums[left] + nums[right]
    if sum < M:
        left += 1
    elif sum > M:
        right -= 1
    else:
        left += 1
        right -= 1
        count += 1

print(count)
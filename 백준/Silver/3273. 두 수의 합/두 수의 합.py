N = int(input())
nums = list(map(int, input().split()))
X = int(input())

nums.sort()

left = 0
right = len(nums) - 1
answer = 0
while left < right:
    if nums[left] + nums[right] == X:
        answer += 1
        left += 1
        right -= 1
    elif nums[left] + nums[right] < X:
        left += 1
    elif nums[left] + nums[right] > X:
        right -= 1
print(answer)

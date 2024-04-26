N = int(input())

answer = 0
for i in range(1, N + 1):
    nums = list(map(int, str(i)))
    if i < 100:
        answer += 1  # 100보다 작으면 모두 한수
    elif nums[0] - nums[1] == nums[1] - nums[2]:
        answer += 1  # 각 자리 등차수열 확인
print(answer)
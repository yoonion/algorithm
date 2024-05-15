N = int(input())

nums = []
for i in range(N):
    x, y = map(int, input().split())
    nums.append((x, y))
nums.sort(key=lambda x: (x[1], x[0]))

for x, y in nums:
    print(x, y)
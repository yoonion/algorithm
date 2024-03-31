import sys

answer = [0] * 10
N = int(sys.stdin.readline())
for _ in range(2):
    N = N * int(sys.stdin.readline())

nums = list(map(int, str(N)))

for num in nums:
    answer[num] += 1

for i in answer:
    print(i)
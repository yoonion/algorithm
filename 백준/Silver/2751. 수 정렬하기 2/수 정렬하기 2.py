import sys

N = int(sys.stdin.readline())

nums = []
for _ in range(N):
    nums.append(int(sys.stdin.readline()))

nums.sort() # 파이썬의 sort()는 Tim sort 알고리즘 - 평균 O(NlogN) 의 시간 복잡도 / 최선 O(n)

for i in nums:
    print(i)
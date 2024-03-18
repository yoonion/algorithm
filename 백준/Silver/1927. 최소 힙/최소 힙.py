from sys import stdin
import heapq

N = int(stdin.readline())

nums = []
for _ in range(N):
    num = int(stdin.readline().strip())
    if num == 0:
        if len(nums) == 0:
            print(0) # 힙 비어있으면 0 출력
        else:
            print(heapq.heappop(nums)) # 힙이 비어있지 않으면 최소값 pop
    else:
        heapq.heappush(nums, num)
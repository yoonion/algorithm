import sys

N = int(sys.stdin.readline())

ropes = []
for _ in range(N):
    ropes.append(int(sys.stdin.readline()))
ropes.sort(reverse=True)

answer = 0
for i in range(len(ropes)):
    answer = max(answer, ropes[i] * (i + 1))
print(answer)
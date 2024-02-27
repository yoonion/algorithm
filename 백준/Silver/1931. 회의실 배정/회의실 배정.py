import sys

N = int(sys.stdin.readline())

meetings = []
for _ in range(N):
    start, end = map(int, sys.stdin.readline().split())
    meetings.append((start, end))

meetings.sort()
meetings.sort(key=lambda x: x[1])

answer = 0
prev_end_time = 0
for start, end in meetings:
    if prev_end_time <= start:
        answer += 1
        prev_end_time = end

print(answer)
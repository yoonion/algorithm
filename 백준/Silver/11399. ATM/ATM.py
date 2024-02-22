N = int(input())

times = list(map(int, input().split()))
times.sort()

answer = 0
accumulate_time = 0
for time in times:
    accumulate_time += time
    answer += accumulate_time

print(answer)
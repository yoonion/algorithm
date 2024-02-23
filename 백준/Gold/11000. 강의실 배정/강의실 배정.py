import heapq

N = int(input())

lectures = []
for _ in range(N):
    start, end = list(map(int, input().split()))
    lectures.append((start, end))
lectures.sort()

end_time_queue = []
for start, end in lectures:
    if not end_time_queue or end_time_queue[0] > start: # 앞 강의가 끝나지 않았을 때, 새로운 강의를 시작함
        heapq.heappush(end_time_queue, end)
    else: # 강의 시작 시간보다 작거나 같은 것은 강의가 끝난 것 > 큐에서 pop 해준다
        heapq.heappop(end_time_queue)
        heapq.heappush(end_time_queue, end)

print(len(end_time_queue))


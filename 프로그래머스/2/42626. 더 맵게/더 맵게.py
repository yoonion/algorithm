import heapq

def solution(scoville, K):
    heapq.heapify(scoville)

    answer = 0
    while len(scoville) >= 2:
        min = heapq.heappop(scoville)

        if min >= K:
            return answer

        min2 = heapq.heappop(scoville)

        heapq.heappush(scoville, min + (min2 * 2))
        answer += 1

    if heapq.heappop(scoville) >= K:
        return answer
    else:
        return -1
N = int(input())

distance = list(map(int, input().split()))
cost = list(map(int, input().split()))

answer = 0
min_cost = cost[0]
for i in range(N - 1):
    if cost[i] < min_cost:
        answer += distance[i] * cost[i]
        min_cost = cost[i]
    else:
        answer += min_cost * distance[i]

print(answer)
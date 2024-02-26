import heapq

V, E = map(int, input().split())
start = int(input())
INF = 10**9

graph = [[] for _ in range(V + 1)]
distance = [INF for _ in range(V + 1)]

for _ in range(E):
    a, b, c = map(int, input().split())
    graph[a].append((b, c))

def dijkstra():
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0
    while q:
        dist, now = heapq.heappop(q)
        # if dist > distance[now]:
        #     continue
        for adj, adj_dist in graph[now]:
            add_dist = dist + adj_dist
            if distance[adj] > add_dist:
                distance[adj] = add_dist
                heapq.heappush(q, (add_dist, adj))

dijkstra()
for i in range(1, V + 1):
    if distance[i] == INF:
        print('INF')
    else:
        print(distance[i])
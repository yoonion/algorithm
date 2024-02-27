import heapq
import sys

INF = sys.maxsize

V = int(sys.stdin.readline()) # 도시의 개수 - 노드의 개수
E = int(sys.stdin.readline()) # 버스의 개수 - 간선의 개수

graph = [[] for _ in range(V + 1)]
costs = [INF for _ in range(V + 1)]

# 그래프
for _ in range(E):
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a].append((b, c))

# 시작 노드, 끝 노드
start, end = map(int, sys.stdin.readline().split())

def dijkstra():
    q = []
    heapq.heappush(q, (0, start))
    costs[start] = 0
    while q:
        cost, now = heapq.heappop(q)
        if cost > costs[now]:
            continue
        for adj, adj_cost in graph[now]:
            add_cost = cost + adj_cost
            if add_cost < costs[adj]:
                costs[adj] = add_cost # 최소 비용 갱신
                heapq.heappush(q, (add_cost, adj))

dijkstra()
print(costs[end])


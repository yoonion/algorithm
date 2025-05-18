import sys
from collections import deque
input = sys.stdin.readline

N, M, K, X = map(int, input().split())
graph = [[] for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)

queue = deque([X])
visited = [-1 for _ in range(N+1)]
visited[X] = 0

# BFS
def bfs():
    while queue:
        now = queue.popleft()
        for node in graph[now]:
            if visited[node] == -1:
                visited[node] = visited[now] + 1
                queue.append(node)
bfs()
if visited.count(K) == 0:
    print(-1)
else:
    for i in range(N+1):
        if visited[i] == K:
            print(i)

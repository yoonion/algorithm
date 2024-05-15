from collections import deque

N, M = map(int, input().split())

graph = [[] for _ in range(N + 1)]
for i in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

result = 0
visited = [0] * (N + 1)
for i in range(1, N + 1):
    q = deque()
    if visited[i] == 0:
        result += 1
        visited[i] = 1
        q.append(graph[i])
        while q:
            v_list = q.popleft()
            for v in v_list:
                if visited[v] == 0:
                    visited[v] = 1
                    q.append(graph[v])
print(result)
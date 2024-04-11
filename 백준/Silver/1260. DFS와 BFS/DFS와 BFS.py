from collections import deque

N, M, V = map(int, input().split())

graph = [[] for _ in range(N + 1)]
for i in range(1, M + 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# 오름차순 출력을 위한 정렬
for i in range(len(graph)):
    graph[i].sort()

dfs_visited = set()
bfs_visited = set()

dfs_answer = []
bfs_answer = []
def dfs(v):
    if v in dfs_visited:
        return

    dfs_visited.add(v) # 방문 처리
    dfs_answer.append(v)
    for v in graph[v]:
        dfs(v)
dfs(V)

def bfs(v):
    q = deque()
    q.append(v)

    bfs_visited.add(v)
    bfs_answer.append(v)

    while q:
        pop = q.popleft()
        for v in graph[pop]:
            if v not in bfs_visited:
                bfs_answer.append(v)
                bfs_visited.add(v)
                q.append(v)
bfs(V)

print(" ".join(map(str, dfs_answer)))
print(" ".join(map(str, bfs_answer)))
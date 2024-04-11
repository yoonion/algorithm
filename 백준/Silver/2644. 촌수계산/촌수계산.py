N = int(input())
graph = [[] for _ in range(N + 1)]

start_v, end_v = map(int, input().split()) # 촌수를 구해야하는 두 사람의 번호

M = int(input())
for _ in range(1, M + 1):
    a, b = map(int, input().split()) # a - 부모, b - 자식
    graph[a].append(b)
    graph[b].append(a)

answer = []
visited = set()
def dfs(L, v):
    visited.add(v)

    if v == end_v:
        answer.append(L)

    for i in graph[v]:
        if i not in visited:
            dfs(L + 1, i)

dfs(0, start_v)

if len(answer) == 0:
    print(-1)
else:
    print(answer[0])
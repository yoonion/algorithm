N = int(input()) # 컴퓨터의 수
M = int(input()) # 컴퓨터 연결선 수

graph = [[] for _ in range(N + 1)] # 그래프
visited = [0] * (N + 1)

# 컴퓨터 연결 그래프 초기화
for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
    graph[a].sort()

def dfs(num):
    visited[num] = 1 # 방문처리

    for i in graph[num]:
        if visited[i] == 0:
            dfs(i)
    return

# 1번 컴퓨터
dfs(1) # graph = [[], [2, 5], [1, 3, 5], [2], [7], [1, 2, 6], [5], [4]]

# 감염된 컴퓨터 개수 계산
result = 0
for visit in visited:
    result += visit

print(result - 1) # 1번 컴퓨터는 개수에서 빼준다
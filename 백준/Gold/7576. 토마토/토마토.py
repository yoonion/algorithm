from collections import deque

M, N = map(int, input().split()) # N - x / M - y

graph = [list(map(int, input().split())) for _ in range(N)]

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

# 익은 토마토
q = deque()
for x in range(N):
    for y in range(M):
        if graph[x][y] == 1:
            q.append((x, y))

while q:
    cur_x, cur_y = q.popleft()
    for i in range(4):
        nx = cur_x + dx[i]
        ny = cur_y + dy[i]
        if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == 0:
            graph[nx][ny] = graph[cur_x][cur_y] + 1
            q.append((nx, ny))

result = 0
for x in range(N):
    for y in range(M):
        if graph[x][y] == 0:
            print(-1)
            exit()
        else:
            result = max(result, graph[x][y])

print(result - 1)
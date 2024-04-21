from collections import *

T = int(input())

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]


for _ in range(T):

    M, N, K = map(int, input().split())
    graph = [[0 for _ in range(M)] for _ in range(N)]
    for _ in range(K):
        b, a = map(int, input().split())
        graph[a][b] = 1

    answer = 0
    for x in range(N):
        for y in range(M):
            if graph[x][y] == 1:
                answer += 1
                q = deque()
                q.append((x, y))
                while q:
                    cur_x, cur_y = q.popleft()
                    graph[cur_x][cur_y] = 0
                    for i in range(4):
                        nx = cur_x + dx[i]
                        ny = cur_y + dy[i]
                        if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == 1:
                            graph[nx][ny] = 0
                            q.append((nx, ny))
    print(answer)
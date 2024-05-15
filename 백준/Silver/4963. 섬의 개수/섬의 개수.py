from collections import deque

# 상 하 좌 우 대각
dx = [1, -1, 0, 0, -1, -1, 1, 1]
dy = [0, 0, 1, -1, -1, 1, -1, 1]

while True:
    result = 0

    W, H = map(int, input().split())
    # 마지막 0,0 나오면 끝
    if W == 0 and H == 0:
        break

    # 행렬 그래프 초기화
    graph = []
    for i in range(H):
        graph.append(list(map(int, input().split())))

    # 그래프 탐색
    for x in range(H):
        for y in range(W):
            if graph[x][y] == 1:
                result += 1
                q = deque()
                q.append((x, y))
                while q:
                    cur_x, cur_y = q.popleft()
                    # 상, 하, 좌, 우, 대각 탐색
                    for i in range(8):
                        nx = cur_x + dx[i]
                        ny = cur_y + dy[i]
                        if 0 <= nx < H and 0 <= ny < W and graph[nx][ny] == 1:
                            graph[nx][ny] = 0
                            q.append((nx, ny))
    print(result)
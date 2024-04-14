from collections import deque

N, M = map(int, input().split())

board = []
for _ in range(N):
    board.append(list(map(int, input().split())))

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

total_count = 0 # 그림의 개수
max_width = 0 # 그림의 최대 넓이
for x in range(N):
    for y in range(M):
        width = 0 # 해당 그림의 넓이 저장할 변수
        if board[x][y] == 1:
            board[x][y] = 0 # 방문처리
            total_count += 1 # 그림의 개수 증가
            width += 1

            q = deque()
            q.append((x, y))
            while q:
                now_x, now_y = q.popleft()
                # 상하좌우 탐색
                for i in range(4):
                    nx = now_x + dx[i]
                    ny = now_y + dy[i]
                    if 0 <= nx < N and 0 <= ny < M and board[nx][ny] == 1:
                        board[nx][ny] = 0 # 방문처리
                        width += 1 # 넓이 체크
                        q.append((nx, ny))
            max_width = max(max_width, width) # 그림의 넓이 최댓값 저장

print(total_count)
print(max_width)
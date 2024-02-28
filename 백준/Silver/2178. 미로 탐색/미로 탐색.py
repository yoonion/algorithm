import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split())

board = []
for i in range(N):
    board.append(list(map(int, sys.stdin.readline().rstrip())))

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

def BFS():
    q = deque()
    q.append((0, 0))
    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and board[nx][ny] == 1:
                board[nx][ny] = board[x][y] + 1
                q.append((nx, ny))

BFS()
print(board[-1][-1])
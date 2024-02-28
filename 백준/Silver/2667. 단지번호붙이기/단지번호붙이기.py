from sys import stdin

N = int(input())

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

total = 0 # 총 집 구역의 개수
DFS_count = 0 # DFS의 깊이 개수 - 몇번 recursive 했는지
DFS_count_lst = [] # DFS의 깊이 개수 출력을 위해서 담아 둘 곳

# 2차원 리스트 생성
board = []
for i in range(N):
    readline = stdin.readline().strip()
    board.append(list(readline))

len = len(board)

def DFS(row, col):

    if row < 0 or row >= len or col < 0 or col >= len or board[row][col] == '0':
        return

    # 상하좌우 방문처리
    board[row][col] = '0'
    global DFS_count
    DFS_count += 1
    for i in range(4):
        nx = row + dx[i]
        ny = col + dy[i]
        DFS(nx, ny)

# 탐색 시작
for row in range(len):
    for col in range(len):
        if board[row][col] == '1':
            DFS(row, col)
            DFS_count_lst.append(DFS_count)
            DFS_count = 0
            total += 1

print(total)
for count in sorted(DFS_count_lst):
    print(count)
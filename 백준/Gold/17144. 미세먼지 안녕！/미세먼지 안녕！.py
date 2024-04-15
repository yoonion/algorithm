import copy

def spread_dust():
    before_board = copy.deepcopy(board) # 이전 board를 계속 참조하며 먼지를 확산시켜야 해서 깊은 복사

    for x in range(row):
        for y in range(col):
            # '0'이 아닌 경우, 먼지 상하좌우 확산 / 공기청정기(-1)은 확산하지 않음
            if before_board[x][y] != 0 and before_board[x][y] != -1:
                for i in range(4):
                    nx = x + dx[i]
                    ny = y + dy[i]
                    if (nx >= 0 and nx < row and ny >= 0 and ny < col and before_board[nx][ny] != -1):
                        board[nx][ny] += before_board[x][y] // 5
                        board[x][y] -= before_board[x][y] // 5

# 위 반시계 방향으로 회전
def rotate_dust_top():
    d = 1  # 오른쪽 방향으로 시작
    before = 0

    # 공기청정기 머리부분의 바로 오른쪽 칸부터 시작
    x = cleaner_top
    y = 1
    while True:
        nx = x + dx[d]
        ny = y + dy[d]
        if nx == row or ny == col or nx == -1 or ny == -1:  # 현재 좌표가 꼭짓점인 경우
            d = (d - 1) % 4 # 방향 전환
            continue
        if x == cleaner_top and y == 0:  # 한 바퀴 회전 완료해서 공기청정기 좌표로 다시 돌아온 경우
            break
        board[x][y], before = before, board[x][y]
        x = nx
        y = ny

# 아래 시계방향 회전
def rotate_dust_bottom():
    d = 1  # 오른쪽 방향으로 시작
    before = 0

    # 공기청정기 아래부분의 바로 오른쪽 칸부터 시작
    x = cleaner_bottom
    y = 1
    while True:
        nx = x + dx[d]
        ny = y + dy[d]
        if nx == row or ny == col or nx == -1 or ny == -1:  # 현재 좌표가 꼭짓점인 경우
            d = (d + 1) % 4 # 방향 전환
            continue
        if x == cleaner_bottom and y == 0:  # 한 바퀴 회전 완료해서 공기청정기 좌표로 다시 돌아온 경우
            break
        board[x][y], before = before, board[x][y]
        x = nx
        y = ny

# 상 우 하 좌
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

row, col, time = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(row)]

# 공기 청정기 위치 찾기
for i in range(row):
    if board[i][0] == -1:
        cleaner_top = i
        cleaner_bottom = i + 1
        break

# time 만큼 실행한다
for _ in range(time):
    spread_dust()
    rotate_dust_top()
    rotate_dust_bottom()

# 공기 청정기 -1 2개 제외하고 다 더하기
answer = 0
for x in range(row):
    for y in range(col):
        if board[x][y] != -1:
            answer += board[x][y]

print(answer)
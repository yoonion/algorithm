import sys
input = sys.stdin.readline

def flip(x,y):
    if x+3>n or y+3>m:
        return -1
    for i in range(x,x+3):
        for j in range(y,y+3):
            if board[i][j] == 0:
                board[i][j] = 1
            else:
                board[i][j] = 0

n,m = map(int,input().split())
board = [list(map(int,list(input().rstrip()))) for _ in range(n)]
ans = [list(map(int,list(input().rstrip()))) for _ in range(n)]

t = 0
for i in range(n-2):
    for j in range(m-2):
        if board[i][j] != ans[i][j]:
            t += 1
            flip(i,j)

print(t if board == ans else -1)
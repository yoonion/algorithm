from collections import deque

n,m,k = map(int,input().split())
map_ = [[0]*m for _ in range(n)]

for _ in range(k):
    r,c = map(int,input().split())
    map_[r-1][c-1] = 1

ans = []          
q = deque()
for i in range(n):
    for j in range(m):
        if map_[i][j] == 1:
            q.append((i,j))
            cnt = 0

            while q:
                x,y = q.popleft()
                cnt += 1
                dx = [0,0,1,-1]
                dy = [1,-1,0,0]

                for k in range(4):
                    nx = x + dx[k]
                    ny = y + dy[k]
                    if 0 <= nx < n and 0 <= ny < m:
                        if map_[nx][ny] == 1:
                            a = max(map_[nx][ny] + 1, map_[x][y] + 1)
                            map_[nx][ny] = a
                            map_[x][y] = a
                            q.append((nx,ny))
            ans.append(cnt)
print(max(ans))
import sys

INF = 10**9

V, E = map(int, sys.stdin.readline().split())

graph = [[INF] * (V + 1) for _ in range(V + 1)] # 1 부터 시작.
for _ in range(E):
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a][b] = c

for k in range(V + 1): # 거쳐 가는 노드
    for a in range(V + 1): # 출발 노드
        for b in range(V + 1): # 도착 노드
            # a -> b 보다 a -> k -> b의 경로가 더 짧은지 검사
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

# 사이클 찾기 -> 자기 자신에서 출발해서 자기자신으로 돌아오는 것 확인
answer = INF
for i in range(1, V + 1):
    answer = min(answer, graph[i][i])

if answer == INF:
    print(-1)
else:
    print(answer)
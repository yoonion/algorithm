import collections
from collections import deque

N = int(input())

answer = {} # 내노드: 부모 노드 - 정보를 저장

# 그래프 초기화
graph = collections.defaultdict(list)
for i in range(N - 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# {1: [6, 4], 6: [1, 3], 3: [6, 5], 5: [3], 4: [1, 2, 7], 2: [4], 7: [4]})
def BFS(root):
        q = deque()
        q.append(root)
        while q:
            parent = q.popleft()
            for child in graph[parent]:
                if child not in answer: # 부모 노드 정보 저장
                    answer[child] = parent
                    q.append(child)
# 1번부터 탐색 시작
BFS(1)

# 2번 부터 출력 해준다
for i in range(2, N + 1):
    print(answer[i])
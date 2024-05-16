N = int(input()) # 컴퓨터의 수
M = int(input()) # 연결할 수 있는 선의 수

# 부모 노드 찾기. 만약 부모 노드가 다르다면 연결 시켜준다
def find_parent(x):
    if parent[x] != x:
        parent[x] = find_parent(parent[x])
    return parent[x]

def union_parent(a, b):
    a = find_parent(a)
    b = find_parent(b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

parent = [i for i in range(N + 1)] # 노드 번호 - 부모
edges = [] # 비용 & 간선

for _ in range(M):
    a, b, cost = map(int, input().split())
    edges.append((cost, a, b))

edges.sort() # 가장 적은 비용이 드는 간선 부터 선택하기 위해서 정렬

result = 0
for cost, a, b in edges:
    if find_parent(a) != find_parent(b): # 부모 노드가 같다면 사이클이 일어나기 때문에, 같다면 지나간다.
        union_parent(a, b)
        result += cost

print(result)
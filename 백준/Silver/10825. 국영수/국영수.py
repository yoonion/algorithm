N = int(input())

scores = []
for _ in range(N):
    scores.append(input().split())
scores.sort(key=lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]))

for score in scores:
    print(score[0])
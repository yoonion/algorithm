N = int(input())

scores = []
for _ in range(N):
    scores.append(int(input()))

answer = 0
for i in range(N-1, 0, -1):
    if scores[i - 1] >= scores[i]:
       answer += scores[i - 1] - scores[i] + 1
       scores[i - 1] = scores[i] - 1
print(answer)

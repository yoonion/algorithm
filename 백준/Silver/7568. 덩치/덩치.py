N = int(input())

answer = []
humans = []
for _ in range(N):
    humans.append(tuple(map(int, input().split())))

for cur_x, cur_y in humans:
    count = 1
    for x, y in humans:
        if cur_x < x and cur_y < y:
            count += 1
    answer.append(count)

print(' '.join(list(map(str, answer))))
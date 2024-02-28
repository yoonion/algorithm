import sys

N = int(sys.stdin.readline())

rgb_list = []
for _ in range(N):
    rgb_list.append(list(map(int, sys.stdin.readline().split())))

# [[26, 40, 83], [49, 60, 57], [13, 89, 99]]
for i in range(1, N):
    rgb_list[i][0] = min(rgb_list[i - 1][1], rgb_list[i - 1][2]) + rgb_list[i][0]
    rgb_list[i][1] = min(rgb_list[i - 1][0], rgb_list[i - 1][2]) + rgb_list[i][1]
    rgb_list[i][2] = min(rgb_list[i - 1][0], rgb_list[i - 1][1]) + rgb_list[i][2]

print(min(rgb_list[-1]))
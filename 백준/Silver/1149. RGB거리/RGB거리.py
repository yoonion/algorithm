import sys

N = int(sys.stdin.readline())

rgb = []
for _ in range(N):
    rgb.append(list(map(int, sys.stdin.readline().split())))

# [[26, 40, 83], [49, 60, 57], [13, 89, 99]]
for i in range(1, N):
    rgb[i][0] = min(rgb[i - 1][1], rgb[i - 1][2]) + rgb[i][0]
    rgb[i][1] = min(rgb[i - 1][0], rgb[i - 1][2]) + rgb[i][1]
    rgb[i][2] = min(rgb[i - 1][0], rgb[i - 1][1]) + rgb[i][2]

print(min(rgb[-1]))
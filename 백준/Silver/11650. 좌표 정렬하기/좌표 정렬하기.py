N = int(input())

coordinates = []
for _ in range(N):
    x, y = map(int, input().split())
    coordinates.append((x, y,))
coordinates.sort(key=lambda x: (x[0], x[1]))

for x, y in coordinates:
    print(x, y)
N = int(input())

serials = []
for _ in range(N):
    serial = input()

    sum = 0
    for i in serial:
        if i.isdigit():
            sum += int(i)
    serials.append((serial, sum))

serials.sort(key=lambda x: (len(x[0]), x[1], x[0]))
for serial in serials:
    print(serial[0])
T = int(input())

for _ in range(T):
    loop, s = map(str, input().split())
    for char in s:
        for _ in range(int(loop)):
            print(char, end="")
    print()
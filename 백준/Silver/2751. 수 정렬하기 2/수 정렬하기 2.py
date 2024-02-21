N = int(input())
num = []

for tc in range(N):
    num.append(int(input()))

num.sort()

for i in num:
    print(i)
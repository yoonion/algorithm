T = int(input())
for _ in range(T):

    dic = {}
    N = int(input())
    for _ in range(N):
        name, type = input().split()
        if type not in dic:
            dic[type] = 1
        else:
            dic[type] += 1

    result = 1
    for val in dic.values():
        result *= val + 1
    print(result-1)

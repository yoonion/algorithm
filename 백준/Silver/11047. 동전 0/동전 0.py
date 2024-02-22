N, K = map(int, input().split())

money_list = []
for _ in range(N):
    money_list.append(int(input()))

money_list.sort(reverse=True)

count = 0
for money in money_list:
    count += K // money

    K %= money

    if K == 0:
        break

print(count)
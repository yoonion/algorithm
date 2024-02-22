N, K = map(int, input().split())

money_list = []
for _ in range(N):
    money_list.append(int(input()))

money_list.sort(reverse=True)

count = 0
for money in money_list:
    money_count = K // money
    if money_count > 0:
        count += money_count
        K -= money_count * money

    if K == 0:
        break

print(count)
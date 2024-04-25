N, C = map(int, input().split())

dic = {}
nums = list(map(int, input().split()))
for num in nums:
    if num in dic:
        dic[num] += 1
    else:
        dic[num] = 1
sorted_dic = sorted(dic.items(), key=lambda x: -x[1])

for key, value in sorted_dic:
    for _ in range(value):
        print(key, end=" ")
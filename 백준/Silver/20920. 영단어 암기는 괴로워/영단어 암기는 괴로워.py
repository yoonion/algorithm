N, M = map(int, input().split())

dic = {}
for i in range(N):
    input_str = input()
    if len(input_str) >= M:
        if input_str in dic:
            dic[input_str] += 1
        else:
            dic[input_str] = 1

sorted_dic = dict(sorted(dic.items(), key=lambda x: (-x[1], -len(x[0]), x[0])))

for key in sorted_dic.keys():
    print(key)
N = int(input())

dic = {}
for _ in range(N):
    str = input()
    if str in dic:
        dic[str] += 1
    else:
        dic[str] = 1

max_count = 0
sorted_dic = dict(sorted(dic.items()))

answer = ""
for s in sorted_dic:
    if answer == "":
        answer = s
        max_count = sorted_dic[s]
    else:
        if sorted_dic[s] > max_count:
            answer = s
            max_count = sorted_dic[s]

print(answer)

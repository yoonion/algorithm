N = int(input())

dic = {}
for _ in range(N):
     num = int(input())
     if num in dic:
         dic[num] += 1
     else:
         dic[num] = 1

sorted_dic = sorted(dic.items(), key=lambda x : (-x[1], x[0]))
print(sorted_dic[0][0])
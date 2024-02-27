import sys

input_str = sys.stdin.readline().rstrip()

nums = input_str.split("-")

lst = []
for num in nums:
    lst.append(sum(map(int, num.split("+"))))

answer = lst[0]
for i in range(1, len(lst)):
    answer -= lst[i]

print(answer)
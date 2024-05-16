A, B = map(int, input().split())
A_nums = list(map(int, input().split()))
B_nums = list(map(int, input().split()))

add = A_nums + B_nums
add.sort()
result = ' '.join(list(map(str, add)))
print(result)
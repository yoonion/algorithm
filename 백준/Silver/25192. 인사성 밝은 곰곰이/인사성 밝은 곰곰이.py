N = int(input())
sets = set()
count = 0
for _ in range(N):
    input_str = input()
    if input_str == "ENTER":
        sets = set()
    else:
        if input_str not in sets:
            sets.add(input_str)
            count += 1

print(count)

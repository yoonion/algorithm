N = int(input())

strs = set()
for _ in range(N):
    strs.add(input())

sorted_strs = sorted(strs, key=lambda s: (len(s), s))
print('\n'.join(sorted_strs))
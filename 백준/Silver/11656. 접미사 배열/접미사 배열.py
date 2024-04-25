S = input()

strs = []
for i in range(len(S)):
    s = S[i:]
    strs.append(s)
strs.sort()
print('\n'.join(strs))
T = int(input())

for i in range(1, T + 1):
    s = input()

    left = 0
    right = len(s) - 1

    flag = True
    while left < right:
        if s[left] != s[right]:
            flag = False
            break
        left += 1
        right -= 1
        
    if flag is True:
        print(f"#{i}", 1)
    else:
        print(f"#{i}", 0)

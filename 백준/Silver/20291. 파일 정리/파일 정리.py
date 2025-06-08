def file_clean(n):
    ans = {}
    for _ in range(n):

        split_s = input().split(".")[1]

        ans.setdefault(split_s, 0)
        ans[split_s] += 1

    for k, v in sorted(ans.items(), key=lambda x: x[0]):
        print(k, v)


n = int(input())
file_clean(n)
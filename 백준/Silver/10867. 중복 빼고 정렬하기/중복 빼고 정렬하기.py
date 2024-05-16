N = int(input())
nums = set(map(int, input().split()))
result = list(sorted(nums))
print(' '.join(map(str, result)))
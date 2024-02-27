N = int(input())

dp = [0] * (N + 1)

for i in range(2, N + 1):
    dp[i] = dp[i - 1] + 1   # 1을 더한 수
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i // 2] + 1)  # 2의 배수 인 경우
        
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i // 3] + 1) # 3의 배수 인 경우

print(dp[N])

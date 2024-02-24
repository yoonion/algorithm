N = int(input())
request_budgets = list(map(int, input().split()))
limited_total_budget = int(input())

answer = 0
left = 0
right = max(request_budgets) # 요청 예산 중, 가장 높은 금액
while left <= right:
    mid = (left + right) // 2

    total = 0
    for budget in request_budgets:
        total += min(budget, mid)

    if total > limited_total_budget:
        right = mid - 1
    else:
        left = mid + 1

    if total <= limited_total_budget:
        answer = max(answer, mid)

print(answer)
N, M = map(int, input().split())
trees = list(map(int, input().split()))

answer = 0 # 절단기의 최대 높이
low = 0
high = max(trees)
while low <= high:
    mid = (low + high) // 2 # 절단기의 높이

    total_tree = 0
    for tree in trees:
        cut_length = tree - mid # 자른 나무의 길이.

        if cut_length > 0: # 음수이면 나무보다 절단기의 높이가 더 높은 것이다
            total_tree += cut_length

    if total_tree < M: # 가져가려는 나무가 최소 나무 길이 보다 적으면, 절단기의 높이를 낮춰서 나무를 더 가져가도록 한다
        high = mid - 1
    else:
        low = mid + 1

    if total_tree >= M:
        answer = max(mid, answer)

print(answer)
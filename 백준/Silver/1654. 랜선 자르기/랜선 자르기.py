K, N = map(int, input().split())

LAN_cables = [int(input()) for _ in range(K)]

answer = 0 # 최대로 자른 랜선 길이

low = 0
high = max(LAN_cables)
while low <= high:
    mid = (low + high) // 2

    if mid == 0:
        answer = 1
        break

    cable_count = 0 # N개 만큼 잘라야함
    for cable_len in LAN_cables:
        cable_count += cable_len // mid

    if cable_count < N:
        high = mid - 1
    else:
        low = mid + 1

    if cable_count >= N: # N개보다 많이 만드는 것도 N개를 만드는 것에 포함
        answer = max(answer, mid)

print(answer)
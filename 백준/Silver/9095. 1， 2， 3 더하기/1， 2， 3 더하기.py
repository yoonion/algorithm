T = int(input())

# 결과 담아서 마지막에 출력
result = []

def DFS(num, sum):
    global count
    # 더한 값이 구하는 값보다 크다면 return
    if num < sum:
        return

    # 더한 값이 구한 값과 같다면 개수 추가
    if num == sum:
        count += 1
        return

    for i in range(1, 4):
        sum += i

        DFS(num, sum)
        sum -= i

# DFS 실행
for _ in range(T):
    num = int(input())
    count = 0
    DFS(num, 0)
    result.append(count)

# 결과 출력
print('\n'.join(map(str, result)))
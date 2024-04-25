T = int(input())

for _ in range(T):
    N, M = map(int, input().split())
    A = sorted(list(map(int, input().split())))
    B = sorted(list(map(int, input().split())))

    answer = 0
    end_index = 0
    for a_num in A:
        while True:
            if end_index == len(B) or a_num <= B[end_index]:
                answer += end_index
                break
            else:
                end_index += 1

    print(answer)
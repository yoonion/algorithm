T = int(input())

for _ in range(T):

    N = int(input())
    members = []
    for _ in range(N):
        a, b = map(int, input().split()) # (서류 순위, 면접 순위)
        members.append((a, b))
    members.sort()

    answer = 0
    top_interview_rank = N + 1
    for docu_rank, interview_rank in members:
        if top_interview_rank > interview_rank:
            answer += 1 # 선발
            top_interview_rank = interview_rank

    print(answer)

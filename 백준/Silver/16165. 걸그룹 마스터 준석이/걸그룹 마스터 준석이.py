N, M = map(int, input().split())

teams = {}
for _ in range(N):
    team_lst = []
    team_name = input()
    member_count = int(input())
    for _ in range(member_count):
        team_lst.append(input())
    teams[team_name] = team_lst

# 0 : 멤버 이름 사전 순 출력 / 1 : 팀 이름 출력
for _ in range(M):
    input_str = input()
    quiz_num = int(input())

    if quiz_num == 1:
        for team in teams:
            if input_str in teams[team]:
                print(team)
    else:
        teams[input_str].sort()
        print("\n".join(teams[input_str]))

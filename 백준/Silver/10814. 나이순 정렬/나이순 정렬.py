N = int(input()) # 회원 수

members = []
for i in range(N):
    age, name = input().split()
    members.append([int(age), name])

members.sort(key=lambda x: x[0]) # Python 은 기본 stable 정렬 - 순서를 그대로 유지 시켜줌

for age, name in members:
    print(age, name)

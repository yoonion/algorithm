
# 시간 문자열 -> 분 으로 변환
def time_to_minutes(str_time):
    split = str_time.split(":")
    HH = int(split[0])
    MM = int(split[1])

    return HH * 60 + MM

S_time, E_time, Q_time = map(time_to_minutes, input().split())

answer = 0
join_members = set()
while True:
    try:
        str_time, member_name = input().split()
        input_time = time_to_minutes(str_time)

        if input_time <= S_time:
            join_members.add(member_name)

        if E_time <= input_time <= Q_time and member_name in join_members:
            join_members.remove(member_name)
            answer += 1
    except:
        break
print(answer)
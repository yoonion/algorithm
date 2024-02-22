T = int(input())

for _ in range(T): # 테스트 케이스 수

    N = int(input()) # 전화번호 개수
    phone_numbers = []
    for _ in range(N):
        phone_numbers.append(input())

    # 문자열 sort의 경우, 문자열 1번째 비교후 같으면 -> 2번째 비교, 같으면 -> 3번째 비교... 순이다
    phone_numbers.sort()

    # sort 후, 인접한 문자열이 서로 포함 되어있는지 확인
    answer = "YES"
    for i in range(N - 1):
        # 인접한 문자열 포함 비교
        # if phone_numbers[i] in phone_numbers[i + 1] or phone_numbers[i + 1] in phone_numbers[i]:
        if phone_numbers[i] == phone_numbers[i + 1][:len(phone_numbers[i])]:
            answer = "NO"
            break

    print(answer)
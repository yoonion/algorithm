import sys

# 산술평균
def calculate_average():
    return round(sum(numbers) / len(numbers))

# 중앙값
def calculate_median():
    median_idx = len(numbers) // 2
    return numbers[median_idx]

# 최빈값
def calculate_mode():
    dic = {}
    for number in numbers:
        if number not in dic:
            dic[number] = 1 # 없으면 1 넣어줌
        else:
            dic[number] += 1  # 있으면 +1

    max_count = max(dic.values()) # 나온 최대 횟수

    max_counts = [] # 최빈값 숫자를 저장 - 여러개 일 수 있음
    for num, count in dic.items():
        if count == max_count:
            max_counts.append(num)

    # 1개 이면 바로 return
    if len(max_counts) == 1:
        return max_counts[0]

    # 여러개 이면 두 번째로 작은 값 return
    max_counts.sort()
    return max_counts[1]

# 범위
def calculate_range():
    return abs(numbers[-1] - numbers[0])

######### START #########
N = input()

numbers = []
for _ in range(int(N)):
    numbers.append(int(sys.stdin.readline()))
numbers.sort()

print(calculate_average()) # 산술평균
print(calculate_median())# 중앙값
print(calculate_mode()) # 최빈값
print(calculate_range()) # 범위

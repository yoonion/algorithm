scores = {}
for i in range(1, 9):
    scores[i] = int(input())
sorted_scores = sorted(scores.items(), key=lambda x: -x[1])

total_score = 0
question_nums = []
for question_num, score in sorted_scores:
    if score != 0 and len(question_nums) < 5:
        question_nums.append(question_num)
        total_score += score
question_nums.sort()
print(total_score)
print(' '.join(map(str, question_nums)))
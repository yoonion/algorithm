input_str = input()

# 97 ~ 122
for i in range(97, 123):
    char = chr(i)

    if char in input_str:
        print(input_str.index(char), end=" ")
    else:
        print(-1, end=" ")
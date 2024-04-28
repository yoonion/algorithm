while True:

    try:
        num = str(int(input()))

        if num == "0":
            break

        answer = "yes"
        left = 0
        right = len(num) -1
        while left < right:
            if num[left] != num[right]:
                answer = "no"
                break

            left += 1
            right -= 1

        print(answer)

    except EOFError:
        break
while True:
    try:
        input_str = input()
        stack = []
        answer = "yes"

        if input_str == ".":
            break

        for s in input_str:
            if s == "(" or s == "[":
                stack.append(s)
            elif s == ")":
                if not stack:
                    answer = "no"
                    break
                pop = stack.pop()
                if pop != "(":
                    answer = "no"
                    break
            elif s == "]":
                if not stack:
                    answer = "no"
                    break
                pop = stack.pop()
                if pop != "[":
                    answer = "no"
                    break
        if stack:
            answer = "no"
        print(answer)

    except EOFError:
        break


import sys

N = int(input())

stack = []

for _ in range(N):
    input_str = sys.stdin.readline().strip()
    if 'push' in input_str:
        _,x = input_str.split()
        stack.append(x)
    elif input_str == 'top':
        if not stack:
            print(-1)
        else:
            print(stack[-1])
    elif input_str == 'size':
        print(len(stack))
    elif input_str == 'empty':
        if not stack:
            print(1)
        else:
            print(0)
    elif input_str == 'pop':
        if not stack:
            print(-1)
        else:
            print(stack.pop())
import sys
laser = sys.stdin.readline()
stack = []
stick_num = 0
last = ''
for i in laser:
    if i == '(':
        stack.append(i)
    elif i == ')':
        if last == ')':
            stick_num += 1
        else:
            stick_num += (len(stack) - 1)
        stack.pop()
    last = i

print(stick_num)
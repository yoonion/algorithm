def solution(s):
    
    strs = s.lower().split(" ")
    
    after_strs = []
    for s in strs:
        if s:
            after_strs.append(s[0].upper() + s[1:])
        else:
            after_strs.append(s)
    
    return ' '.join(after_strs)

def solution(sizes):
    
    w_list = []
    h_list = []
    for w, h in sizes:
        w_list.append(max(w, h))
        h_list.append(min(w, h))
        
    return max(w_list) * max(h_list)
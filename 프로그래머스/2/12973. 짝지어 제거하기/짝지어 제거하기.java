import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<String> dq = new ArrayDeque<>();
        for(String ss : s.split("")) {
            if(dq.isEmpty()) {
                dq.offer(ss);
            } else {
                if(ss.equals(dq.peekLast())) {
                    dq.pollLast();
                } else {
                    dq.offer(ss);
                }
            }
        }
        
        if(dq.isEmpty()) {
            return 1;
        }
        
        return 0;
    }
}
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] strs = s.split("");
        
        Deque<String> dq = new ArrayDeque<>();
        for (String ss : strs) {
            if (ss.equals("(")) {
                dq.offer(ss);
            } else {
                if (dq.isEmpty()) {
                    answer = false;
                    break;
                }
                
                dq.pollLast();
            }
        }
        
        if (!dq.isEmpty()) {
            answer = false;
        }
        
        return answer;
    }
}
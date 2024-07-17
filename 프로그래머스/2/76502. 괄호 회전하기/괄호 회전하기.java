import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ss = s.split("");
        Deque<String> dq = new ArrayDeque<>();
        for (int i=0; i<ss.length; i++) {
            dq.offer(ss[i]);
        }
        
        for (int i=0; i<ss.length; i++) {
            String str = "";
            if (i==0) {
                str = dqToString(dq);
            } else {
                dq.offerLast(dq.poll()); // 회전
                str = dqToString(dq);
            }
            
            // 올바른 괄호 문자열 확인
            if (isRight(str)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 올바른 괄호 문자열인지 확인
    public boolean isRight(String str) {
        String[] strs = str.split("");
        Deque<String> dq = new ArrayDeque<>();
        for (String ss : strs) {
            if (ss.equals("(") || ss.equals("{") || ss.equals("[")) {
                dq.offer(ss);
            } else {
                if (dq.isEmpty()) return false;
                
                String peek = dq.peekLast();
                if (ss.equals(")")) {
                    if (peek.equals("(")) {
                        dq.pollLast();
                    } else {
                        return false;
                    }
                } else if (ss.equals("}")) {
                    if (peek.equals("{")) {
                        dq.pollLast();
                    } else {
                        return false;
                    }
                } else if (ss.equals("]")) {
                    if (peek.equals("[")) {
                        dq.pollLast();
                    } else {
                        return false;
                    }
                }
            }
        }
        
        if (!dq.isEmpty()) {
            return false;
        }
        
        return true;
    }
    
    // 덱 -> 문자열 변환
    public String dqToString(Deque<String> dq) {
        StringBuilder sb = new StringBuilder();
        for (String s : dq) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int n : arr) {
            if (dq.isEmpty()) {
                dq.offer(n);
            } else {
                if (dq.peekLast() == n) continue;
                dq.offer(n);
            }
        }
        
        int[] answer = new int[dq.size()];
        int idx = 0;
        while (!dq.isEmpty()) {
            answer[idx] = dq.poll();
            idx++;
        }
        
        return answer;
    }
}
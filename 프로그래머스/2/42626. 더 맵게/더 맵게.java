import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : scoville) {
            pq.offer(n);
        }
        
        int answer = 0;
        while (pq.peek() < K) {
            if (pq.size() > 1) {
                int s1 = pq.poll();
                int s2 = pq.poll() * 2;    
                pq.offer(s1 + s2);
            } else {
                if (pq.poll() < K) {
                    return -1;
                }
            }
            
            answer++;
        }
        
        return answer;
    }
}
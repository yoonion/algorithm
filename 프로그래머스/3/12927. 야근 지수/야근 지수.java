import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            pq.offer(work);
        }
        
        long answer = 0;
        while (n>0) {
            int poll = pq.poll();
            if (poll==0) {
                return answer;
            } else {
                pq.offer(poll-1); // 가장 오래 걸리는 작업 -1 해주고, 우선순위 큐에 다시 넣어줌   
            }
             
            n--;
        }
        
        // 총 야근 지수 구하기
        while (!pq.isEmpty()) {
            int poll = pq.poll();
            answer += poll*poll;
        }
        
        return answer;
    }
}
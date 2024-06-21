import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> dq = new ArrayDeque<>();
        int answer = 0;
        int sum = 0;
        for (int t : truck_weights) {
            
            while (true) {
                if (dq.isEmpty()) {
                    dq.offer(t);
                    answer++;
                    sum += t;
                    break;
                } else if (dq.size() == bridge_length) {
                    sum -= dq.poll();
                } else {
                    if (sum + t <= weight) {
                        dq.offer(t);
                        answer++;
                        sum += t;
                        break;
                    } else {
                        dq.offer(0);
                        answer++;
                    }
                }
            }
        }
        
        return answer += bridge_length;
    }
}
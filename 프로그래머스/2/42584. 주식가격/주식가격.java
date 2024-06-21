import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Deque<Integer> dq = new ArrayDeque<>();
        for (int price : prices) {
            dq.offer(price);
        }
        
        int idx = 0;
        while (!dq.isEmpty()) {
            int poll = dq.poll();
            for (int i=idx + 1; i<prices.length; i++) {
                if (poll > prices[i]) {
                    answer[idx]++; // 가격이 떨어진 순간 1초 더하고 break;
                    break;
                } else {
                    answer[idx]++; // 가격이 떨어지지 않았으면 1초씩 더함
                }
            }
            idx++;
        }
        return answer;
    }
}
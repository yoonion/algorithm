import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        for (String operation : operations) {
            String[] splits = operation.split(" ");
            String command = splits[0];
            int num = Integer.parseInt(splits[1]);
            if (command.equals("I")) {
                minPq.offer(num);
                maxPq.offer(num);
            } else {
                // 우선순위 큐 비어있는지 확인
                if (minPq.isEmpty()) continue;

                // 최솟값 삭제
                if (num == -1) {
                    int minPoll = minPq.poll();
                    maxPq.remove(minPoll);
                }
                // 최댓값 삭제
                else if (num == 1) {
                    int maxPoll = maxPq.poll();
                    minPq.remove(maxPoll);
                }
            }
        }
        

        if (minPq.isEmpty()) {
            return new int[]{0, 0};
        } 
        
        int min = minPq.poll();
        int max = maxPq.poll();
        
        return new int[]{max, min};
    }
}
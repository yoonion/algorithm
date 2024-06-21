import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int answerIdx = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            List<Integer> newNums = new ArrayList<>();
            for (int idx=i-1; idx<j; idx++) {
                newNums.add(array[idx]);
            }
            newNums.sort(null);
            
            answer[answerIdx] = newNums.get(k-1);
            answerIdx++;
        }
        
        return answer;
    }
}
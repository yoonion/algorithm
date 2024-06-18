import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        String[] strs = s.split("");
        for(int i = 1; i < answer.length; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(strs[i].equals(strs[j])) {
                    answer[i] = i-j;
                    break;
                }
                if(j == 0 && answer[i] == 0){
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}
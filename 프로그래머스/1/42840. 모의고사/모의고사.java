import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] n3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] results = {0, 0, 0};
        
        for (int i=0; i<answers.length; i++) {
            int answer = answers[i];
            if(answer == n1[i%5]) results[0]++;
            if(answer == n2[i%8]) results[1]++;
            if(answer == n3[i%10]) results[2]++;
        }
        
        List<Integer> r = new ArrayList<>();
        int maxScore = 0;
        for (int i=0; i<results.length; i++) {
            maxScore = Math.max(maxScore, results[i]);
        }
        
        for (int i=0; i<results.length; i++) {
            if (results[i] == maxScore) {
                r.add(i+1);
            }
        }
        
        int[] answerArr = new int[r.size()];
        for (int i=0; i<answerArr.length; i++) {
            answerArr[i] = r.get(i);
        }
        
        return answerArr;
        
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strs = s.split("");
        Arrays.sort(strs, Comparator.reverseOrder());
        String answer = String.join("", strs);
        
        return answer;
    }
}
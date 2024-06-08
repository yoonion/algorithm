import java.util.*;

class Solution {
    public String solution(String s) {
        String newAnswer = "";
        
        String[] strs = s.split("");
        System.out.println(Arrays.toString(strs));
        int idx = 0;
        for(String ss : strs) {
            if (ss.equals(" ")) {
                idx = 0;
                newAnswer += ss;
            } else {
                if (idx % 2 == 0) {
                    newAnswer += ss.toUpperCase();
                } else {
                    newAnswer += ss.toLowerCase();
                }
                idx++;
            }
        }
        
        return newAnswer;
    }
}
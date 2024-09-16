import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for (String s : completion) {
            Integer n = map.get(s);
            if (n-1 == 0) {
                map.remove(s);
            } else {
                map.put(s, n-1);
            }
        }
        
        String answer = "";
        for (String key : map.keySet()) {
            answer = key;
        }
        
        return answer;
    }
}
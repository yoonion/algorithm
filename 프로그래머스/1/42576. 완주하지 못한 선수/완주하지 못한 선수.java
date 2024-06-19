import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for (String completeName : completion) {
            int count = map.get(completeName);
            if (count==1) {
               map.remove(completeName);
            } else {
                map.put(completeName, map.get(completeName) - 1);
            }
        }
        
        for (String ss : map.keySet()) {
            answer = ss;
        }
        
        return answer;
    }
}
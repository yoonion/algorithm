import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String key = clothe[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        for (Integer value : map.values()) {
            answer *= value + 1;
        }
        
        return answer - 1;
    }
}
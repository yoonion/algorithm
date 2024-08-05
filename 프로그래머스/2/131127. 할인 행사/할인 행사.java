import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 구매할 정보 map
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i=0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for (int i=0; i < discount.length-9; i++) {
            // 할인 정보 map
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j=0; j<10; j++) {
                discountMap.put(discount[i+j], discountMap.getOrDefault(discount[i+j], 0) + 1);
            }

            boolean flag = true;

            for(String key : wantMap.keySet()) {
                if(wantMap.get(key) != discountMap.get(key)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }
        }
        return answer;
    }
}
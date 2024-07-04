import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        
        // 변경 불가능 한 경우
        if (!set.contains(target)) {
            return 0;    
        }
        
        int answer = 0;
        Deque<String> dq = new ArrayDeque<>();
        dq.offer(begin);
        while (!dq.isEmpty()) {
            answer++;
            int size = dq.size();
            for (int i=0; i<size; i++) {
                String poll = dq.poll();
                for (String s : set) {
                    
                    // 변환이 가능하다면 큐에 추가
                    if (isConvertable(poll, s)) {
                        if (s.equals(target)) {
                            return answer;
                        }
                        dq.offer(s);
                    }
                }
            }
            
            // 현재 depth에 해당하는 단어들은 전부 set에서 제거
            for (String s : dq) {
                set.remove(s);
            }
        }
        
        return 0;
    }
    
    public boolean isConvertable(String s, String target) {
        String[] compares = s.split("");
        String[] targets = target.split("");
        int count = 0;
        for (int i=0; i<targets.length; i++) {
            if (!compares[i].equals(targets[i])) {
                count++;
            }
        }
        
        if (count == 1){
            return true;
        }
        
        return false;
    }
}
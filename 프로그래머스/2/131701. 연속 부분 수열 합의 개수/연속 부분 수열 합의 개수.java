import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        for (int length=1; length<=elements.length; length++) { // 부분 수열의 길이
            for (int startIndex=0; startIndex<elements.length; startIndex++) { // 시작 인덱스
                
                int sum = 0;
                for (int i=startIndex; i<startIndex+length; i++) {
                    sum += elements[i % elements.length];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}
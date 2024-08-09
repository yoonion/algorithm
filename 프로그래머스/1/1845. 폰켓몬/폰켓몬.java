import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int N = nums.length / 2;
        
        for (int num : nums) {
            set.add(num);
        }
        
        if (set.size() >= N) {
            return N;
        }
        
        return set.size();
    }
}
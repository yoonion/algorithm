import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int limit = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        
        if (set.size() < limit) {
            return set.size();
        }
        
        return limit;
        
    }
}
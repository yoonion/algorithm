import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int limitSelectCount = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        if (limitSelectCount <= set.size()) {
            return limitSelectCount;
        }
        
        return set.size();
    }
}
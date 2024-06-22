import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int maxW = 0;
        int maxH = 0;
        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            
            maxW = Math.max(Math.max(w, h), maxW);
            
            maxH = Math.max(Math.min(w, h), maxH);
        }
        
        return maxW * maxH;
    }
}
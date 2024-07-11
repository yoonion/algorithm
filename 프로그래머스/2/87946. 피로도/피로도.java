import java.util.*;

class Solution {
    
    int answer = 0;
    boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        DFS(0, k, dungeons);
        
        return answer;
    }
    
    void DFS(int depth, int k, int[][] dungeons) {
        for (int i=0; i<dungeons.length; i++) {
            if (k < dungeons[i][0] || visited[i]) continue;
            
            visited[i] = true;
            DFS(depth + 1, k - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        
        answer = Math.max(answer, depth);
    }
}
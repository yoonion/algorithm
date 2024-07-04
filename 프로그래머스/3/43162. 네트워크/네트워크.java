import java.util.*;

class Solution {
    
    int answer = 0;
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        for (int i=0; i<n; i++) {
            if(visited[i] == false) {
                bfs(i, computers);    
                answer++;    
            }
        }
        
        return answer;
    }
    
    public void bfs(int i, int[][] computers) {
        Deque<Integer> dq = new ArrayDeque<>();
        visited[i] = true;
        for (int j=0; j<computers[i].length; j++) {
            if (visited[j] == false && computers[i][j] == 1) {
                dq.offer(j);
                while (!dq.isEmpty()) {
                    int poll = dq.poll();
                    for (int k=0; k<computers[poll].length; k++) {
                        if (computers[poll][k] == 1 && visited[k] == false) {
                            dq.offer(k);
                            visited[k] = true;
                        }

                    }
                }
            }
        }
    }
}
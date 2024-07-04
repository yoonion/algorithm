import java.util.*;

class Solution {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    public int solution(int[][] maps) {

        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(new int[]{0, 0});
        while (!dq.isEmpty()) {
            int[] poll = dq.poll();
            int x = poll[0];
            int y = poll[1];
            // 상, 하, 좌, 우 탐색
            for (int k=0; k<4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[x].length && maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[x][y] + 1;
                    dq.offer(new int[]{nx, ny});
                }
            }
        }
        
        // 도달하지 못 하였을 때
        if (maps[maps.length-1][maps[0].length-1]==1) {
            return -1; 
        } 
        
        return maps[maps.length-1][maps[0].length-1];
    }
}
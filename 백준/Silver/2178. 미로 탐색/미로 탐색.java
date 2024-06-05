import java.util.*;

class Main {

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static int N;
    static int M;
    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        graph = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String[] split = sc.nextLine().split("");
            for (int j = 0; j < split.length; j++) {
                graph[i][j] = Integer.parseInt(split[j]);
            }
        }

        visited[0][0] = true;
        BFS(0, 0);
        System.out.println(graph[N-1][M-1]);
    }

    static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nx = now[0];
            int ny = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nx + dx[i];
                int nextY = ny + dy[i];

                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && graph[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    q.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    graph[nextX][nextY] = graph[nx][ny] + 1;
                }
            }
        }

    }
}
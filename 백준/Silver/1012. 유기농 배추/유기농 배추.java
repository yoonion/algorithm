import java.util.*;

class Main {

    static int[][] graph;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int N;
    static int M;
    static List<Integer> answers = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {

            String[] sp1 = sc.nextLine().split(" ");
            M = Integer.parseInt(sp1[0]); // 가로 길이
            N = Integer.parseInt(sp1[1]); // 세로 길이
            int K = Integer.parseInt(sp1[2]); // 배추 개수

            // 그래프 초기화
            graph = new int[N][M];
            for (int j = 0; j < K; j++) {
                String[] sp2 = sc.nextLine().split(" ");
                int x = Integer.parseInt(sp2[0]);
                int y = Integer.parseInt(sp2[1]);
                graph[y][x] = 1;
            }

            BFS();
        }

        for (Integer answer : answers) {
            System.out.println(answer);
        }
    }

    static void BFS() {
        int answer = 0;
        Deque<int[]> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] == 1) {
                    answer++;
                    graph[i][j] = 0; // 방문처리
                    dq.offer(new int[]{i, j});
                    while (!dq.isEmpty()) {
                        int[] poll = dq.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = poll[0] + dx[k];
                            int ny = poll[1] + dy[k];
                            if (nx >= 0 && nx < N && ny >= 0 && ny < M && graph[nx][ny] == 1) {
                                graph[nx][ny] = 0;
                                dq.offer(new int[]{nx, ny});
                            }
                        }
                    }
                }
            }
        }
        answers.add(answer);
    }
}
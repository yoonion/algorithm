import java.util.*;

class Main {

    static int[][] graph;
    static int[] visited;
    static int N;
    static int M;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점의 개수
        M = sc.nextInt(); // 간선의 개수

        // 그래프 초기화
        graph = new int[N + 1][N + 1];
        visited = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }

        BFS();
        System.out.println(answer);
    }

    // 그래프 BFS 탐색
    static void BFS() {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i < N + 1; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                dq.offer(i);
                answer++;
                while (!dq.isEmpty()) {
                    Integer poll = dq.poll();
                    for (int j = 1; j < N + 1; j++) {
                        if (graph[poll][j] == 1 && visited[j] == 0) {
                            dq.offer(j);
                            visited[j] = 1;
                        }
                    }
                }
            }
        }
    }
}
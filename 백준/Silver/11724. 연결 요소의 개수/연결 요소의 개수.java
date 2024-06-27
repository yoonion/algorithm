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

        for (int i = 1; i < N + 1; i++) {
            if (visited[i] == 0) {
                DFS(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    // 그래프 BFS 탐색
    static void DFS(int v) {
        visited[v] = 1;
        for (int i = 1; i < graph[v].length; i++) {
            if (graph[v][i] == 1 && visited[i] == 0) {
                DFS(i);
            }
        }
    }
}
import java.util.*;

class Main {

    static int graph[][];
    static int visited[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        graph = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }

        visited = new int[N + 1];
        DFS(V);

        System.out.println();

        visited = new int[N + 1];
        BFS(V);
    }

    public static void DFS(int V) {
        visited[V] = 1;
        System.out.print(V + " ");
        for (int i = 1; i < graph[V].length; i++) {
            if (graph[V][i] == 1 && visited[i] == 0) {
                DFS(i);
            }
        }
    }

    public static void BFS(int V) {
        visited[V] = 1;
        System.out.print(V + " ");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(V);
        while (!dq.isEmpty()) {
            int poll = dq.poll();
            for (int i = 1; i < graph[poll].length; i++) {
                if (graph[poll][i] == 1 && visited[i] == 0) {
                    dq.offer(i);
                    visited[i] = 1;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
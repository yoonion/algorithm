import java.util.*;

class Main {

    static int[][] graph;
    static boolean[] visited;
    static int answer = 0;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        M = Integer.parseInt(sc.nextLine());

        visited = new boolean[N + 1];
        graph = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            String[] s = sc.nextLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            graph[a][b] = graph[b][a] = 1;
        }
        visited[1] = true;
        BFS(1);
        System.out.println(answer);
    }

    static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        while (!q.isEmpty()) {
            Integer nowV = q.poll();
            for (int i = 1; i < N + 1; i++) {
                if (graph[nowV][i] == 1 && !visited[i]) {
                    answer++;
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}
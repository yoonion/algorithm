import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    static int[][] graph;
    static int[] visited;
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
        System.out.println();
    }

    public static void DFS(int v) {
        visited[v] = 1;
        System.out.print(v + " ");

        for(int j = 1; j < graph.length; j++) {
            // 연결된 노드인데 방문하지 않은 경우
            if(graph[v][j] == 1 && visited[j] == 0) {
                // 연결된 노드 찾으면 재귀함수 호출
                DFS(j);
            }
        }
    }

    public static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = 1; // 방문 체크
        System.out.print(v + " ");
        while (!q.isEmpty()) {
            Integer next = q.poll();
            for (int i = 1; i < graph[next].length; i++) {
                if (graph[next][i] == 1 && visited[i] == 0) {
                    visited[i] = 1;
                    System.out.print(i + " ");
                    q.offer(i);
                }
            }
        }
    }

}
import java.util.*;

class Main {

    static int N;
    static int K;
    static int count = 0;
    static int[] graph;
    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 수빈이 위치
        K = sc.nextInt(); // 동생 위치

        graph = new int[200_000];
        visited = new int[200_000];

        BFS();
        System.out.println(count);
    }

    static void BFS() {
        // 같은 경우 무조건 0
        if (N == K) {
            return;
        }

        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(N);
        visited[N] = 1;
        while (!dq.isEmpty()) {
            Integer poll = dq.poll();
            int prevCount = graph[poll];

            if (poll - 1 >= 0 && poll - 1 < 200_000) {
                if (visited[poll - 1] == 0) {
                    graph[poll - 1] = prevCount + 1;
                    visited[poll - 1] = 1;
                    dq.offer(poll - 1);
                }
            }

            if (poll + 1 >= 0 && poll + 1 < 200_000) {
                if (visited[poll + 1] == 0) {
                    graph[poll + 1] = prevCount + 1;
                    visited[poll + 1] = 1;
                    dq.offer(poll + 1);
                }
            }

            if (poll * 2 >= 0 && poll * 2 < 200_000) {
                if (visited[poll * 2] == 0) {
                    graph[poll * 2] = prevCount + 1;
                    visited[poll * 2] = 1;
                    dq.offer(poll * 2);
                }
            }

            if (graph[K] > 0) {
                count = graph[K];
                return;
            }

        }
    }
}
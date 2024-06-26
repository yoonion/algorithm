import java.util.*;

class Main {
    
    static int[][] graph;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int N;
    static int totalCount = 0; // 단지(덩어리)의 개수
    static List<Integer> list = new ArrayList<>(); // 각 단지의 집 개수 저장할 리스트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        // 행렬 초기화
        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] splits = sc.nextLine().split("");
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(splits[j]);
            }
        }

        BFS();
        list.sort(null);

        System.out.println(totalCount);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    static void BFS() {
        Deque<int[]> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == 1) {
                    totalCount++;
                    graph[i][j] = 0; // 방문처리
                    dq.offer(new int[]{i, j});

                    // 상, 하, 좌, 우 탐색하여 1인 집 탐색
                    int count = 1;
                    while (!dq.isEmpty()) {
                        int[] poll = dq.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = poll[0] + dx[k];
                            int ny = poll[1] + dy[k];
                            if (nx >= 0 && nx < N && ny >= 0 && ny < N && graph[nx][ny] == 1) {
                                count++;
                                graph[nx][ny] = 0; // 방문처리
                                dq.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    list.add(count);
                }
            }
        }
    }
}
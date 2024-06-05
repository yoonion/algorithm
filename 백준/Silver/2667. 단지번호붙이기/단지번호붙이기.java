import java.util.*;

class Main {

    static int[][] graph;
    static int N;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int totalCount;
    static List<Integer> eachCount = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] s = sc.nextLine().split("");
            for (int j = 0; j < s.length; j++) {
                int n = Integer.parseInt(s[j]);
                graph[i][j] = n;
            }
        }

        BFS();
        Collections.sort(eachCount);

        System.out.println(totalCount);
        for (Integer n : eachCount) {
            System.out.println(n);
        }
    }

    static void BFS() {
        Queue<int[]> q = new LinkedList<>();
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                int count = 0;
                if (graph[x][y] == 1) {
                    graph[x][y] = 0;
                    count++;
                    totalCount++; // 총 단지 개수 증가
                    q.offer(new int[]{x, y});
                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        int nowX = poll[0];
                        int nowY = poll[1];
                        for (int i = 0; i < 4; i++) {
                            int nextX = nowX + dx[i];
                            int nextY = nowY + dy[i];
                            if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && graph[nextX][nextY] == 1) {
                                count++;
                                graph[nextX][nextY] = 0;
                                q.offer(new int[]{nextX, nextY});
                            }
                        }
                    }
                    eachCount.add(count);
                }
            }
        }
    }
}
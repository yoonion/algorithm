import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N;
    static int maxAnswer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        // 행렬 초기화
        int[][] board = new int[N][N];
        int maxValue = 0; // 행렬의 최댓값
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < split.length; j++) {
                int num = Integer.parseInt(split[j]);
                board[i][j] = num;
                maxValue = Math.max(maxValue, num);
            }
        }

        // 행렬 탐색
        for (int i = 0; i <= maxValue; i++) {

            int[][] newBoard = new int[N][N]; // 잠기는 구간을 표시할 행렬
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    // 물에 잠김
                    if (board[j][k] <= i) {
                        newBoard[j][k] = 1;
                    }
                }
            }

            BFS(newBoard);
        }

        System.out.println(maxAnswer);
    }

    static void BFS(int[][] board) {
        Deque<int[]> dq = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    count++;
                    board[i][j] = 1;
                    dq.offer(new int[]{i, j});
                    while (!dq.isEmpty()) {
                        int[] poll = dq.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = poll[0] + dx[k];
                            int ny = poll[1] + dy[k];
                            if (nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] == 0) {
                                dq.offer(new int[]{nx, ny});
                                board[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }
        maxAnswer = Math.max(maxAnswer, count);
    }
}
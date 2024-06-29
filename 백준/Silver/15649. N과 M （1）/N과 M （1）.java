import java.util.*;

class Main {

    static int[] visited;
    static int N, M;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new int[N];
        answer = new int[M];

        DFS(0);
        System.out.println(sb);
    }

    static void DFS(int depth) {
        if (depth == M) {
            for (int n : answer) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                answer[depth] = i + 1;
                DFS(depth + 1);
                visited[i] = 0;
            }
        }
    }
}
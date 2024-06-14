import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {

    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push")) {
                dq.offer(Integer.parseInt(s[1]));
            } else if (s[0].equals("front")) {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.peekFirst()).append("\n");
                }
            } else if (s[0].equals("back")) {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.peekLast()).append("\n");
                }
            } else if (s[0].equals("size")) {
                sb.append(dq.size()).append("\n");
            } else if (s[0].equals("pop")) {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pop()).append("\n");
                }
            } else if (s[0].equals("empty")) {
                if (dq.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
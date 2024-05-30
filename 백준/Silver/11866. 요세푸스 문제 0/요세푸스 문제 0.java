import javax.swing.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        List<String> answers = new ArrayList<>();
        while (!q.isEmpty()) {
            for (int i = 0; i < K; i++) {
                if (i == K - 1) {
                    answers.add(String.valueOf(q.poll()));
                } else {
                    q.offer(q.poll());
                }
            }
        }

        System.out.print("<");
        System.out.print(String.join(", ", answers));
        System.out.print(">");
    }
}
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            int totalScore = 0;
            double avg = 0;
            int N = sc.nextInt();
            int[] scores = new int[N];
            for (int j = 0; j < N; j++) {
                int score = sc.nextInt();
                scores[j] = score;
                totalScore += score;
            }

            avg = (double) totalScore / N;

            int overCount = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > avg) {
                    overCount++;
                }
            }

            double result = (double) overCount / N * 100;
            System.out.println(Math.round(result * 1000.0) / 1000.0 + "%");
        }
    }
}
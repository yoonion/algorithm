import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = sc.nextInt();
        }

        Arrays.sort(ints);

        double maxScore = ints[ints.length - 1];
        double totalScore = 0;
        for (int i = 0; i < N; i++) {
            totalScore += ints[i] / maxScore * 100;
        }
        System.out.println(totalScore / N);
    }
}
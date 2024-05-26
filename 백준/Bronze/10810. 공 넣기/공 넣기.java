import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ints = new int[N];

        for (int idx = 0; idx < M; idx++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int k = sc.nextInt();

            for (int l = i; l <= j; l++) {
                ints[l] = k;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = i + 1;
        }

        for (int idx = 0; idx < M; idx++) {
            int basketA = sc.nextInt() - 1;
            int basketB = sc.nextInt() - 1;

            int temp = ints[basketA];
            ints[basketA] = ints[basketB];
            ints[basketB] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
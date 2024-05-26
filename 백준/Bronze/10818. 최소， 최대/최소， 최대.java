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
        System.out.println(Arrays.stream(ints).min().getAsInt());
        System.out.println(Arrays.stream(ints).max().getAsInt());
    }
}
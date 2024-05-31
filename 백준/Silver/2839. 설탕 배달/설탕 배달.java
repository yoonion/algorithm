import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        while (true) {
            if (N % 5 == 0) {
                count += N / 5;
                break;
            } else {
                N = N - 3;
                count++;
            }

            if (N >= 1 && N < 3) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
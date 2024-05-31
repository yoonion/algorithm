import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int nextNum = N;
        int count = 0;
        while (true) {
            int ten = nextNum / 10; // 십의 자리 26 > 2
            int one = nextNum % 10; // 일의 자리 26 > 6

            nextNum = one * 10 + (ten + one) % 10;     //  x =  6  * 10 + (2   +  6 ) % 10 = 68
            count++;

            if (N == nextNum) {
                break;
            }
        }
        System.out.println(count);
    }
}
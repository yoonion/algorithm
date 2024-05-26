import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberCount = 9;

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < numberCount; i++) {
            int inputNum = sc.nextInt();
            if (inputNum > max) {
                idx = i + 1;
                max = inputNum;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
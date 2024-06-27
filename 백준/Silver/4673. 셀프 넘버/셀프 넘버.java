import java.util.*;

class Main {

    public static void main(String[] args) {
        int[] arr = new int[10_001];
        for (int i = 1; i <= 10_000; i++) {
            if (d(i) <= 10_000) {
                arr[d(i)] = 1;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }


    }

    static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
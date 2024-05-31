import java.util.Scanner;

class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        int fiveBagCount = inputNum / 5;

        int minBagCount = -1;
        while (fiveBagCount > -1) {

            int remainKg = inputNum - (fiveBagCount * 5);

            if (remainKg % 3 == 0) {
                int threeBagCount = remainKg / 3;
                int totalBagcount = fiveBagCount + threeBagCount;
                if (minBagCount == -1) {
                    minBagCount = totalBagcount;
                } else if (minBagCount > totalBagcount) {
                    minBagCount = totalBagcount;
                }

            }

            fiveBagCount--;
        }

        System.out.println(minBagCount);
    }
}
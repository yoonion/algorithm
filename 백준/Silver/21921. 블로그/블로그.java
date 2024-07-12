import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += nums[i];
        }

        int count = 1;
        int maxSum = sum;
        for (int i = X; i < nums.length; i++) {
            sum += nums[i] - nums[i - X];
            if (maxSum < sum) {
                maxSum = sum;
                count = 1;
            } else if (maxSum == sum) {
                count++;
            }
        }

        if (maxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxSum);
            System.out.println(count);
        }
    }
}
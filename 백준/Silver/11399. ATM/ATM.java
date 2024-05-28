import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        int sum = 0;
        int accSum = 0;
        for (int num : nums) {
            accSum += num;
            sum += accSum;
        }

        System.out.println(sum);
    }
}
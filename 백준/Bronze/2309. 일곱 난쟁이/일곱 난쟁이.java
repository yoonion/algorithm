import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            sum += n;
            nums[i] = n;
        }

        Arrays.sort(nums);

        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sum - nums[i] - nums[j] == 100) {
                    n1 = nums[i];
                    n2 = nums[j];
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (!(nums[i] == n1 || nums[i] == n2)) {
                System.out.println(nums[i]);
            }
        }
    }
}

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
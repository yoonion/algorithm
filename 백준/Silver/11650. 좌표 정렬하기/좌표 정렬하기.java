import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[][] nums = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] s = sc.nextLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            nums[i][0] = x;
            nums[i][1] = y;
        }

        Arrays.sort(nums, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        for (int[] num : nums) {
            System.out.println(num[0] + " " + num[1]);
        }
    }
}
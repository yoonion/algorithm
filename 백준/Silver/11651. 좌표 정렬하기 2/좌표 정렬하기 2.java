import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[][] nums = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] split = sc.nextLine().split(" ");
            nums[i][0] = Integer.parseInt(split[0]);
            nums[i][1] = Integer.parseInt(split[1]);
        }

        Arrays.sort(nums, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(nums[i][0] + " " + nums[i][1]);
        }
    }
}
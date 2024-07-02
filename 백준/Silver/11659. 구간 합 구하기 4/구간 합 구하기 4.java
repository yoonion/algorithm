import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] nums = new int[N];
        String[] s2 = br.readLine().split(" ");
        for (int i = 0; i < s2.length; i++) {
            if (i == 0) {
                nums[i] = Integer.parseInt(s2[i]);
            } else {
                nums[i] = nums[i - 1] + Integer.parseInt(s2[i]); // 누적 합 저장
            }
        }

        for (int i = 0; i < M; i++) {
            String[] s3 = br.readLine().split(" ");
            int start = Integer.parseInt(s3[0]);
            int end = Integer.parseInt(s3[1]);
            if (start == 1) {
                sb.append(nums[end - 1]).append("\n");
            } else {
                sb.append(nums[end - 1] - nums[start - 2]).append("\n");
            }

        }

        System.out.println(sb);
    }
}
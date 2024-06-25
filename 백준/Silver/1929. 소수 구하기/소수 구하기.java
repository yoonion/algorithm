import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[N + 1];

        // 배열 각 인덱스 번호로 초기화
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        // 에라토스테네스의 체
        for (int i = 2; i * i <= N; i++) {
            if (arr[i] == 0) continue;
            for (int j = i * i; j <= N; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) {
                System.out.println(i);
            }
        }
    }
}
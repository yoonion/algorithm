import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            sb.append(map.getOrDefault(sc.nextInt(), 0)).append(" ");
        }
        System.out.println(sb);
    }
}

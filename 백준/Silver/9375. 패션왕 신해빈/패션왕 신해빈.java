import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(sc.nextLine());
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                String[] split = sc.nextLine().split(" ");
                String key = split[1];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int result = 1;
            for (int val : map.values()) {
                result *= (val + 1); // 안 입는 경우를 +1 해주어서 조합을 구함
            }
            System.out.println(result - 1);
        }
    }
}
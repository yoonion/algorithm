import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        Set<String> S = new HashSet<>();
        for (int i = 0; i < N; i++) {
            S.add(sc.nextLine());
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            if (S.contains(sc.nextLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
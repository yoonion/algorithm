import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            Deque<String> left = new ArrayDeque<>();
            Deque<String> right = new ArrayDeque<>();
            String[] strs = sc.nextLine().split("");
            for (String str : strs) {
                if (str.equals("<")) {
                    if (!left.isEmpty()) {
                        right.offerFirst(left.pollLast());
                    }
                } else if (str.equals(">")) {
                    if (!right.isEmpty()) {
                        left.offerLast(right.pollFirst());
                    }
                } else if (str.equals("-")) {
                    if (!left.isEmpty()) {
                        left.pollLast();
                    }
                } else {
                    left.offerLast(str);
                }
            }

            StringBuilder sb = new StringBuilder();
            while (!left.isEmpty()) {
                sb.append(left.pollFirst());
            }

            while (!right.isEmpty()) {
                sb.append(right.pollFirst());
            }

            System.out.println(sb);
        }
    }
}
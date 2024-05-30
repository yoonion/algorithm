import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(sc.nextLine());

        int lastNum = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String[] s = sc.nextLine().split(" ");
            switch (s[0]) {
                case "push" -> {
                    q.offer(Integer.parseInt(s[1]));
                    lastNum = Integer.parseInt(s[1]);
                }
                case "pop" -> {
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.poll()).append("\n");
                    }
                }
                case "size" -> sb.append(q.size()).append("\n");
                case "empty" -> {
                    if (q.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                }
                case "front" -> {
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.peek()).append("\n");
                    }
                }
                case "back" -> {
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(lastNum).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            Deque<String> dq = new ArrayDeque<>();
            String[] strs = sc.nextLine().split("");
            for (String str : strs) {
                if (dq.isEmpty()) {
                    dq.offer(str);
                } else {
                    if (str.equals(dq.peekLast())) {
                        dq.pollLast();
                    } else {
                        dq.offer(str);
                    }
                }
            }

            if (dq.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}

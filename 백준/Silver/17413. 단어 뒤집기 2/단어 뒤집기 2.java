import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String inputStr = sc.nextLine();
        String[] strs = inputStr.split("");

        boolean flag = false;
        Deque<String> dq = new ArrayDeque<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("<")) {
                flag = true;
                while (!dq.isEmpty()) {
                    sb.append(dq.pollLast());
                }
                sb.append(strs[i]);
            } else if (strs[i].equals(">")){
                flag = false;
                sb.append(strs[i]);
            } else if (flag) {
                sb.append(strs[i]);
            } else {
                if (strs[i].equals(" ")) {
                    while (!dq.isEmpty()) {
                        sb.append(dq.pollLast());
                    }
                    sb.append(strs[i]);
                } else {
                    dq.offer(strs[i]);
                }
            }
        }

        while (!dq.isEmpty()) {
            sb.append(dq.pollLast());
        }

        System.out.println(sb);
    }
}
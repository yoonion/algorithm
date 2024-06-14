import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        for (int i = 0; i < N; i++) {
            Stack<String> stack = new Stack<>();
            String inputStr = sc.next();
            String[] strs = inputStr.split("");
            String answer = "YES";
            for (String str : strs) {
                if (str.equals("(")) {
                    stack.push(str);
                } else if (str.equals(")")) {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                answer = "NO";
            }

            System.out.println(answer);
        }
    }
}
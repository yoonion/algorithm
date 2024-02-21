import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String answer = "YES";
            Stack<String> stack = new Stack<>();

            String inputString = sc.next();
            String[] strings = inputString.split("");
            for (String string : strings) {
                if (string.equals("(")) {
                    stack.push(string);
                } else {
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
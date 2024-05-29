import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        int answer = N;
        for (int i = 0; i < N; i++) {
            String inputStr = sc.next();
            for (int j = 0; j < inputStr.length(); j++) {
                char c = inputStr.charAt(j);
                if (inputStr.indexOf(c) != j) {
                    if (!(inputStr.charAt(j - 1) == inputStr.charAt(j))) {
                        answer--;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
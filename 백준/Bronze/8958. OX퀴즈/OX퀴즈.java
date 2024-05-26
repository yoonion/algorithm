import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            String inputStr = sc.nextLine();

            int answer = 0;
            int score = 0;
            for (int j = 0; j < inputStr.length(); j++) {
                char c = inputStr.charAt(j);
                if (c == 'O') {
                    score++;
                    answer += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(answer);
        }

    }
}
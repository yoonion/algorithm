import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String targetStr = sc.nextLine();

        String s = inputStr.replaceAll(targetStr, "_");
        String[] split = s.split("");
        int answer = 0;
        for (String ss : split) {
            if (ss.equals("_")) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
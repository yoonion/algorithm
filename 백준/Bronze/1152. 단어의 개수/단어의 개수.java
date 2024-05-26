import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();
        String[] s = inputStr.split(" ");

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (!s[i].isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
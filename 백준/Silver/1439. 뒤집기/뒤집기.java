import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("");

        int zero_count = 0;
        int one_count = 0;

        if (strs[0].equals("0")) {
            zero_count++;
        } else {
            one_count++;
        }

        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].equals(strs[i - 1])) {
                if (strs[i].equals("1")) {
                    one_count++;
                } else {
                    zero_count++;
                }
            }
        }

        System.out.println(Math.min(zero_count, one_count));
    }
}
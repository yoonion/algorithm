import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("");

        int zero_count = 0;
        int one_count = 0;
        String beforeStr = "-1";
        for (int i = 0; i < strs.length; i++) {
            if (beforeStr.equals("-1")) {
                if (strs[i].equals("0")) {
                    zero_count++;
                    beforeStr = "0";
                } else {
                    one_count++;
                    beforeStr = "1";
                }
            } else if (!beforeStr.equals(strs[i])) {
                if (strs[i].equals("0")) {
                    zero_count++;
                    beforeStr = "0";
                } else {
                    one_count++;
                    beforeStr = "1";
                }
            }
        }

        System.out.println(Math.min(zero_count, one_count));
    }
}
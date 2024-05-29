import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String inputStr = sc.next();
        for (char c = 97; c <= 122; c++) {
            sb.append(inputStr.indexOf(c)).append(" ");
        }

        System.out.println(sb);
    }
}
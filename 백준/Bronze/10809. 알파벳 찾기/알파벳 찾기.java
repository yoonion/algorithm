import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        for (char c = 97; c <= 122; c++) {
            System.out.print(inputStr.indexOf(c) + " ");
        }
    }
}
import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputString = sc.next();
        String upperInputString = inputString.toUpperCase();

        int[] countArray = new int[26];

        for (int i = 0; i < upperInputString.length(); i++) {
            char c = upperInputString.charAt(i);
            countArray[c - 65]++;
        }

        int max = 0;
        char result = '?';
        for (int i = 0; i < countArray.length; i++) {
            if (max < countArray[i]) {
                max = countArray[i];
                result = (char)(i + 65);
            } else if (max == countArray[i]) {
                result = '?';
            }
        }

        System.out.println(result);
    }

}
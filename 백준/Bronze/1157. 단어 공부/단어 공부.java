import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next().toLowerCase();

        int[] ints = new int[26];
        for (int i = 0; i < inputStr.length(); i++) {
            int alphaIndex = inputStr.charAt(i) - 97;
            ints[alphaIndex] += 1;
        }

        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maxValue) {
                maxValue = ints[i];
                maxIndex = i;
            }
        }

        Arrays.sort(ints);
        if (ints[ints.length - 1] == ints[ints.length - 2]) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxIndex + 65));
        }
    }
}
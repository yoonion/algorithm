import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = i + 1; j <= inputStr.length(); j++) {
                set.add(inputStr.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}
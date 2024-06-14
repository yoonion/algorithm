import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        Set<Integer> set = new HashSet<>();
        String[] nums = sc.nextLine().split(" ");
        for (String num : nums) {
            set.add(Integer.parseInt(num));
        }

        int M = Integer.parseInt(sc.nextLine());
        String[] splits = sc.nextLine().split(" ");
        for (String num : splits) {
            if (set.contains(Integer.parseInt(num))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
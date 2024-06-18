import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(sc.nextLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String[] split = sc.nextLine().split(" ");
            if (split[1].equals("enter")) {
                set.add(split[0]);
            } else {
                set.remove(split[0]);
            }
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        int count = 0;
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String str = sc.next();
            if (set.contains(str)) {
                results.add(str);
                count++;
            }
        }
        Collections.sort(results);

        System.out.println(count);
        System.out.println(String.join("\n", results));
    }
}

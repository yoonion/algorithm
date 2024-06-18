import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            String title = sc.nextLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
            max = Math.max(max, map.get(title));
        }

        List<String> answers = new ArrayList<>();
        for (String s : map.keySet()) {
            if (max == map.get(s)) {
                answers.add(s);
            }
        }
        answers.sort(null);
        System.out.println(answers.get(0));
    }
}

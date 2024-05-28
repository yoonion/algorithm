import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<String> strings = new HashSet<>();

        for (int i = 0; i < N; i++) {
            strings.add(sc.next());
        }

        List<String> list = new ArrayList<>(strings);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이가 같은 경우
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (String str : list) {
            System.out.println(str);
        }
    }
}
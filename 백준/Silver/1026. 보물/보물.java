import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] nums1 = sc.nextLine().split(" ");
        List<Integer> listA = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            listA.add(Integer.parseInt(nums1[i]));
        }
        listA.sort(null);

        List<Integer> listB = new ArrayList<>();
        String[] nums2 = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            listB.add(Integer.parseInt(nums2[i]));
        }
        listB.sort(Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += listA.get(i) * listB.get(i);
        }

        System.out.println(answer);
    }
}

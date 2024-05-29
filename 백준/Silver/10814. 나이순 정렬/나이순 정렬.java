import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[][] array = new String[N][2];
        for (int i = 0; i < N; i++) {
            array[i][0] = sc.next();
            array[i][1] = sc.next();
        }

        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (String[] arr : array) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
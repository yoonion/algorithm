import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < A; i++) {
            setA.add(sc.nextInt());
        }

        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < B; i++) {
            setB.add(sc.nextInt());
        }

        int setASize = setA.size();
        int setBSize = setB.size();
        for (Integer i : setA) {
            if (setB.contains(i)) {
                setASize--;
            }
        }

        for (Integer i : setB) {
            if (setA.contains(i)) {
                setBSize--;
            }
        }

        System.out.println(setASize + setBSize);
    }
}
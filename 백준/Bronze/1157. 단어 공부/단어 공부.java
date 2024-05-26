import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String lowerCase = s.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < lowerCase.length(); i++) {
            map.put(lowerCase.charAt(i), map.getOrDefault(lowerCase.charAt(i), 0) + 1);
        }

        List<Character> keys = new ArrayList<>(map.keySet());
        keys.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        Integer maxValue = Integer.MIN_VALUE;
        Character maxResult = null;
        for (Character key : keys) {
            Integer value = map.get(key);
            if (value.equals(maxValue)) {
                maxResult = '?';
                break;
            } else if (value > maxValue) {
                maxValue = value;
                maxResult = key;
            }
        }

        System.out.println(String.valueOf(maxResult).toUpperCase());
    }
}
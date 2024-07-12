import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        String[] table = sc.nextLine().split("");
        int answer = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i].equals("P")) {
                boolean flag = false;
                int startIndex = i - K;
                if(startIndex < 0) startIndex = 0;

                // 왼쪽 탐색
                for (int j = startIndex; j < i; j++) {
                    if (table[j].equals("H")) {
                        answer++;
                        table[j] = "E";
                        flag = true;
                        break;
                    }
                }

                // 왼쪽에서 찾지 못 했으면 오른쪽 탐색
                if (!flag) {
                    int endIndex = Math.min(i + K, table.length - 1);
                    for (int j = i + 1; j <= endIndex; j++) {
                        if (table[j].equals("H")) {
                            answer++;
                            table[j] = "E";
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
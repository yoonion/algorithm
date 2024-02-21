import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int numCount = Integer.parseInt(s);

        int[] numArray = new int[numCount];
        for (int i = 0; i < numCount; i++) {
            numArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArray);

        for (int i = 0; i < numArray.length; i++) {
            bw.write(Integer.toString(numArray[i]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
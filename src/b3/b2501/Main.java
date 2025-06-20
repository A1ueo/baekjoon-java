package b3.b2501;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int n = Integer.parseInt(buff[0]);
        int k = Integer.parseInt(buff[1]);

        int count = 0, answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;

            if (count == k) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}

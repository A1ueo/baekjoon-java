package b3.b25175;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int n = Integer.parseInt(buff[0]);
        int m = Integer.parseInt(buff[1]);
        int k = Integer.parseInt(buff[2]);

        int count = 0;
        if (k > 3) {
            for (int i = 3; i < k; i++) {
                count++;
            }
        } else {
            for (int i = 3; i > k; i--) {
                count++;
            }
        }

        int answer;
        if (k > 3) {
            answer = ((m - 1) + count) % n + 1;
        } else {
            int adder = 0;
            while (count > adder)
                adder += n;
            answer = ((m - 1) - count + adder) % n + 1;
        }
        System.out.println(answer);

    }
}

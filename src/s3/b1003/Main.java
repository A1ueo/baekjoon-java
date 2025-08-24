package s3.b1003;

import java.io.*;

public class Main {
    static int zero = 0;
    static int one = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i= 0 ; i < t; i++) {
            int tmp = Integer.parseInt(br.readLine());
            fib(tmp);
            sb.append(zero + " " + one + "\n");
            zero = 0;
            one = 0;
        }

        System.out.println(sb);
    }

    static int fib(int n) {
        if (n == 0) {
            zero++;
            return 0;
        } else if (n == 1) {
            one++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

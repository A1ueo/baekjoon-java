package b1.b11005;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int num = Integer.parseInt(buff[0]);
        int radix = Integer.parseInt(buff[1]);
        
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int tmp = num % radix;
            if (tmp > 9) {
                char c = (char) ('A' + tmp - 10);
                sb.append(c);
            } else {
                sb.append(tmp);
            }
            num /= radix;
        }

        System.out.println(sb.reverse());
    }
}

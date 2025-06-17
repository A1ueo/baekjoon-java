package b2.b2745;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        String value = buff[0];
        int radix = Integer.parseInt(buff[1]);

        long multiplier = 1;
        long sum = 0;
        for (int i = 0; i < value.length(); i++) {
            char tmp = value.charAt(value.length() - 1 - i);
            if (tmp >= 'A' && tmp <= 'Z') {
                sum += (tmp - 'A' + 10) * multiplier;
            } else {
                sum += (tmp - '0') * multiplier;
            }
            multiplier *= radix;
        }

        System.out.println(sum);
    }
}

package b2.b12778;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] buff = br.readLine().split(" ");
            char c = buff[1].charAt(0);
            buff = br.readLine().split(" ");
            if(c == 'C') {
                for (String s : buff) {
                    sb.append(s.charAt(0) - 'A' + 1).append(" ");
                }
            } else {
                for (String s : buff) {
                    sb.append((char) ('A' - 1 + Integer.parseInt(s))).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}

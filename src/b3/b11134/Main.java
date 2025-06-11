package b3.b11134;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] buff = br.readLine().split(" ");
                int n = Integer.parseInt(buff[0]);
                int c = Integer.parseInt(buff[1]);
                int ans = n / c;
                if (n % c != 0) ans++;
                sb.append(ans).append('\n');
        }

        System.out.println(sb);
    }
}

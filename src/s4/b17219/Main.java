package s4.b17219;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");

        int n = Integer.parseInt(buff[0]);
        int m = Integer.parseInt(buff[1]);

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            buff = br.readLine().split(" ");
            map.put(buff[0], buff[1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            sb.append(map.get(tmp)).append('\n');
        }

        System.out.println(sb);
    }
}

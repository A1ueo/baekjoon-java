package b2.b27160;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[]  buff = br.readLine().split(" ");
            int num = Integer.parseInt(buff[1]);
            map.put(buff[0], map.getOrDefault(buff[0], 0) + num);
        }

        boolean flag = false;
        for (int num : map.values()) {
            if (num == 5) flag = true;
        }

        if (flag == true) System.out.println("YES");
        else System.out.println("NO");
    }
}

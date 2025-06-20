package b1.b9506;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        int n;
        while ((n = Integer.parseInt(br.readLine())) != -1) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) tmp.add(i);
            }

            int sum = 0;
            for (int num : tmp) {
                sum += num;
                if (sum > n) break;
            }
            if (sum == n) map.put(n, tmp);
            else map.put(n, null);
        }

        StringBuilder sb = new StringBuilder();
        for (int key : map.keySet()) {
            if (map.get(key) == null) sb.append(key).append(" is NOT perfect.");
            else{
                sb.append(key).append(" = ");
                List<Integer> list = map.get(key);
                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) sb.append(list.get(i));
                    else sb.append(" + ").append(list.get(i));
                }
            }
        }
        
        System.out.println(sb);
    }
}

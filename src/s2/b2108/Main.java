package s2.b2108;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Map<Integer, Integer> map = new TreeMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            sum += tmp;
        }

        var entries = map.entrySet();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int minRateKey = 0, minRate = Integer.MAX_VALUE;
        int count = 0, center = 0;
        for (var it : entries) {
            if (count == n / 2) center = it.getKey();
            if (it.getKey() > max) max = it.getKey();
            if (it.getKey() < min) min = it.getKey();
            if (it.getValue() > minRate) {
                minRate = it.getValue();
                minRateKey = it.getKey();
            }
            count++;
        }

        StringBuilder sb = new StringBuilder();
        int avg = (int) Math.round((double) sum / n);
        sb.append(avg).append('\n');
        sb.append(center).append('\n');
        // sb.append(minRateKey).append('\n');
        sb.append(max - min);

        System.out.println(sb);
    }
}

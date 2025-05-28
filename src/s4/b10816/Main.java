package s4.b10816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] has = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] check = br.readLine().split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String tmp = has[i];
            if (map.containsKey(tmp)) {
                map.replace(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp, 1);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < m; i++) {
            String tmp = check[i];
            int val = map.getOrDefault(tmp, 0);
            bw.write(val + " ");
        }
        bw.flush();
    }
}

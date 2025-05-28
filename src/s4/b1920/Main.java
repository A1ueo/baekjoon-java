package s4.b1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> hash = new HashSet<>();
        String[] buff = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(buff[i]);
            hash.add(tmp);
        }

        int m = Integer.parseInt(br.readLine());
        buff = br.readLine().split(" ");
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(buff[i]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < m; i++) {
            if (hash.contains(arr[i])) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }
}

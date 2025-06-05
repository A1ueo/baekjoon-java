package s4.b11047;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int n = Integer.parseInt(buff[0]);
        int k = Integer.parseInt(buff[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += k / arr[n - 1 - i];
            k %= arr[n - 1 - i];
        }

        System.out.println(sum);
    }
}

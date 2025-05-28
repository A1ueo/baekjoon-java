package b3.b2875;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);

        int team;
        int left;
        if (n < m * 2) {
            team = n / 2;
            left = m - (n / 2);
        } else {
            team = m;
            left = n - (m * 2);
        }

        while (left < k) {
            team--;
            k -= 3;
        }
        System.out.println(team);
    }
}

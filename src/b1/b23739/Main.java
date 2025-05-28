package b1.b23739;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if (sum < 30)
                sum += tmp;

            if (sum < 30) {
                count++;
            } else if (sum == 30 || sum - 30 <= tmp / 2) {
                count++;
                sum = 0;
            } else {
                sum = 0;
            }
        }
        System.out.println(count);
    }
}

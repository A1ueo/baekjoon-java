package b1.b2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        int answer = 1;
        for (int i = 0; i < n; i++) {
            sum += 6 * i;
            if (n <= sum) {
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);
    }
}

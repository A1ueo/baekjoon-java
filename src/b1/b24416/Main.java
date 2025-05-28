package b1.b24416;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num1 = 0;
        int num2 = 1;
        final int MOD = 1000000007;

        int answer = 0;
        int count = 0;
        for (int i = 0; i < n + 1; i++) {
            count++;
            switch (i) {
                case 0:
                    answer = num1;
                    break;
                case 1:
                    answer = num2;
                    break;
                default:
                    answer = (num1 % MOD + num2 % MOD) % MOD;
                    num1 = num2;
                    num2 = answer;
                    break;
            }
        }
        System.out.printf("%d %d", answer, count);
    }

}

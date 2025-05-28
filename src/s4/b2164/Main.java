package s4.b2164;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int idx = 1;
        int answer = 0;
        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                answer += 2;
                if (answer == Math.pow(2, idx) && i < n - 1) {
                    answer = 0;
                    idx++;
                }
            }
            System.out.println(answer);
        }
    }
}

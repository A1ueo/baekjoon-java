package b2.b15829;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        final int M = 1234567891;
        long r = 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (str.charAt(i) - 'a' + 1) % M * r;
            r = r * 31 % M;
        }
        long hash = sum % M;
        System.out.println(hash);
    }
}

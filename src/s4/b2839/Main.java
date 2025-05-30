package s4.b2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int five = n / 5, three = 0;
        int remainder = n % 5;

        while (remainder % 3 != 0 && !(remainder > n)) {
            remainder += 5;
            five--;
        }

        if (remainder > n || remainder % 3 != 0) {
            System.out.println(-1);
        } else {
            three = remainder / 3;
            System.out.println(five + three);
        }

    }
}

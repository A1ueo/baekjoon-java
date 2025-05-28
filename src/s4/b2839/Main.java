package s4.b2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remainder = n;
        int count = 0;

        // remainder가 0일때?
        for (int i = 0; i <= n / 5.0; i++) {
            remainder -= 5;
            if (remainder % 3 == 0) {
                count = (n - remainder) / 5 + remainder / 3;
            }
        }

        if (count == 0) {
            if (n % 3 == 0) {
                count = n / 3;
            } else {
                count = -1;
            }
        }

        System.out.println(count);
    }
}

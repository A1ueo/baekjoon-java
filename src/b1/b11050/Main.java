package b1.b11050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        for (int i = 1; i <= n - k; i++) {
            answer /= i;
        }
        for (int i = 1; i <= k; i++) {
            answer /= i;
        }

        System.out.println(answer);
    }
}

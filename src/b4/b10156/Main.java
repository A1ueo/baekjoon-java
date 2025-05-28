package b4.b10156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k, n, m;
        k = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        int answer = 0;
        if (k * n - m > 0)
            answer = k * n - m;
        System.out.println(answer);
    }
}

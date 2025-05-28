package b5.b28701;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, sqr = 0, triSqr = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        sqr = sum * sum;

        for (int i = 0; i <= n; i++) {
            triSqr += i * i * i;
        }
        System.out.println(sum);
        System.out.println(sqr);
        System.out.println(triSqr);

    }
}

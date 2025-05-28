package b3.b30802;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sizes = new int[6];
        for (int i = 0; i < 6; i++) {
            int tmp = sc.nextInt();
            sizes[i] = tmp;
        }
        int t = sc.nextInt(), p = sc.nextInt();

        int tCount = 0;
        for (int i = 0; i < 6; i++) {
            tCount += sizes[i] / t;
            if (sizes[i] % t != 0)
                tCount++;
        }
        int pCount = n / p, pLeft = n % p;

        System.out.printf("%d\n%d %d", tCount, pCount, pLeft);
        sc.close();
    }
}

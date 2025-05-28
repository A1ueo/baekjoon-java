package b3.b10707;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        int priceX = a * p;
        int answer = priceX;
        if (p > c) {
            int priceY = b + d * (p - c);
            if (priceX > priceY)
                answer = priceY;
        } else {
            if (priceX > b)
                answer = b;
        }
        System.out.println(answer);
    }
}

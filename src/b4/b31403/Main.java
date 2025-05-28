package b4.b31403;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        String str = String.valueOf(a) + String.valueOf(b);
        int answer = Integer.valueOf(str) - c;
        System.out.println(a + b - c);
        System.out.println(answer);
    }
}

package b5.b2420;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m;
        n = sc.nextLong();
        m = sc.nextLong();
        System.out.println(Math.abs(n - m));
    }
}

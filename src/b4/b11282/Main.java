package b4.b11282;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = (char) ('가' + n - 1);
        System.out.println(c);
    }
}

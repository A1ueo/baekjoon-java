package b3.b17174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int answer = binding(n, m);
        System.out.println(n + answer);
    }

    public static int binding(int num1, int num2) {
        int tmp = num1 / num2;
        if (tmp / num2 != 0) {
            tmp += binding(tmp, num2);
        }
        return tmp;
    }
}

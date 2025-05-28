package b5.b15964;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long answer = (num1 + num2) * (num1 - num2);

        System.out.println(answer);
        sc.close();
    }
}

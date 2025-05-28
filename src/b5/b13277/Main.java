package b5.b13277;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);
        System.out.println(num1.multiply(num2));
    }
}

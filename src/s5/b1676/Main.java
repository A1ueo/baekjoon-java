package s5.b1676;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String str = fact.toString();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(str.length() - i - 1) == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}

package b3.b15818;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        sc.close();

        BigInteger answer = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            answer = answer.multiply(BigInteger.valueOf(list.get(i) % m));
        }
        System.out.println(answer.remainder(BigInteger.valueOf(m)));
    }
}

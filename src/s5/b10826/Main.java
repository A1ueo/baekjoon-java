package s5.b10826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger num1 = new BigInteger("0");
        BigInteger num2 = new BigInteger("1");

        BigInteger answer = new BigInteger("0");
        for (int i = 0; i < n + 1; i++) {
            switch (i) {
                case 0:
                    answer = num1;
                    break;
                case 1:
                    answer = num2;
                    break;
                default:
                    answer = num1.add(num2);
                    num1 = num2;
                    num2 = answer;
                    break;
            }
        }
        System.out.println(answer);
    }
}

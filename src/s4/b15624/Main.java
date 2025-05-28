package s4.b15624;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int num1 = 0;
        int num2 = 1;
        final int MOD = 1000000007;
        BigInteger num = new BigInteger(n).add(new BigInteger("1"));

        int answer = 0;
        for (BigInteger i = new BigInteger("0"); i.compareTo(num) != 0; i = i.add(new BigInteger("1"))) {
            switch (i.toString()) {
                case "0":
                    answer = num1;
                    break;
                case "1":
                    answer = num2;
                    break;
                default:
                    answer = (num1 % MOD + num2 % MOD) % MOD;
                    num1 = num2;
                    num2 = answer;
                    break;
            }
        }
        System.out.println(answer);
    }

}

package b1.b28702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        int next = 0;

        if (!("Fizz".equals(str3) || "Buzz".equals(str3) || "FizzBuzz".equals(str3))) {
            next = Integer.parseInt(str3) + 1;
        } else if (!("Fizz".equals(str2) || "Buzz".equals(str2) || "FizzBuzz".equals(str2))) {
            next = Integer.parseInt(str2) + 2;
        } else if (!("Fizz".equals(str1) || "Buzz".equals(str1) || "FizzBuzz".equals(str1))) {
            next = Integer.parseInt(str1) + 3;
        }

        if (next % 3 == 0 && next % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (next % 3 == 0) {
            System.out.println("Fizz");
        } else if (next % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(next);
        }
    }
}

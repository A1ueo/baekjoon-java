package b3.b25915;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        String str = "ILOVEYONSEI";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += Math.abs(str.charAt(i) - c);
            c = str.charAt(i);
        }
        System.out.println(count);
    }
}

package b4.b15700;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        int n = Integer.parseInt(buff.split(" ")[0]);
        int m = Integer.parseInt(buff.split(" ")[1]);

        System.out.println((long) n * m / 2);
    }
}

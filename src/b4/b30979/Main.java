package b4.b30979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int total = 0;
        String buff = br.readLine();
        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(buff.split(" ")[i]);
        }
        if (total < t) {
            System.out.println("Padaeng_i Cry");
        } else {
            System.out.println("Padaeng_i Happy");
        }
    }
}

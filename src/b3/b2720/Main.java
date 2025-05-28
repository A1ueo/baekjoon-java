package b3.b2720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
        }
        for (int i = 0; i < t; i++) {
            int tmp = list.get(i);
            int querter = tmp / 25;
            tmp %= 25;
            int dime = tmp / 10;
            tmp %= 10;
            int nickel = tmp / 5;
            tmp %= 5;
            int penny = tmp;
            System.out.printf("%d %d %d %d%n", querter, dime, nickel, penny);
        }
    }
}

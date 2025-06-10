package b1.b9506;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


    }

    static String divisors(int n) {
        if (n == 1) return "1";

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sb
            }
        }

        return null;
    }
}

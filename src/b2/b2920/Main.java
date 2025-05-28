package b2.b2920;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int tmp = sc.nextInt();
            arr.add(tmp);
        }

        String answer = "mixed";
        boolean checker = true;
        if (arr.get(0) == 1) {
            for (int i = 0; i < 8; i++) {
                if (arr.get(i) != i + 1) {
                    checker = false;
                }
            }
            if (checker) {
                answer = "ascending";
            }
        } else if (arr.get(0) == 8) {
            for (int i = 0; i < 8; i++) {
                if (arr.get(i) != 8 - i) {
                    checker = false;
                }
            }
            if (checker) {
                answer = "descending";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}

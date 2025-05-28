package b2.b1978;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        boolean check = true;
        if (num == 1)
            check = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++)
                if (num % i == 0) {
                    check = false;
                }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        int count = 0;
        for (int i : list) {
            if (isPrime(i))
                count++;
        }
        System.out.println(count);

        sc.close();
    }
}

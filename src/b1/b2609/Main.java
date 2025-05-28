package b1.b2609;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> searchDivisor(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                list.add(i);
                list.add(num / i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        ArrayList<Integer> num1Factors = searchDivisor(num1);
        ArrayList<Integer> num2Factors = searchDivisor(num2);

        int divisor = 1;
        for (int i : num2Factors) {
            if (num1Factors.contains(i)) {
                if (divisor < i) {
                    divisor = i;
                }
            }
        }
        int multiple = num1 * num2 / divisor;

        System.out.println(divisor);
        System.out.println(multiple);
    }
}

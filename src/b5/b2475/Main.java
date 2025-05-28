package b5.b2475;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int tmp = sc.nextInt();
            intList.add(tmp);
        }
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += Math.pow(intList.get(i), 2);
        }
        int check = total % 10;
        System.out.println(check);
    }
}

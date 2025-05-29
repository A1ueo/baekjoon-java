package b3.b5217;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        ArrayList<Float> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            float tmp = sc.nextInt();
            list.add(tmp);
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.printf("Pairs for %.0f: ", list.get(i));
            for (float j = 1; j < list.get(i) / 2; j++) {
                if (j != 1) {
                    System.out.printf(", ");
                }
                System.out.printf("%.0f %.0f", j, list.get(i) - j);
            }
            System.out.println();
        }
    }
}

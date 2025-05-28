package b3.b10250;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int[] tmp = { h, w, n };
            list.add(tmp);
        }
        sc.close();
        for (int i = 0; i < list.size(); i++) {
            int h = list.get(i)[2] % list.get(i)[0];
            int w = list.get(i)[2] / list.get(i)[0] + 1;
            if (h == 0) {
                h = list.get(i)[0];
                w--;
            }
            System.out.printf("%d%02d\n", h, w);
        }
    }
}

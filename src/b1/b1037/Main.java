package b1.b1037;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            arrList.add(tmp);
        }
        arrList.sort(Comparator.naturalOrder());
        System.out.println(arrList.get(0) * arrList.get(arrList.size() - 1));

    }
}

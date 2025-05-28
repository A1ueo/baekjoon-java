package b4.b30999;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            list.add(tmp);
        }
        sc.close();

        long[] count = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            count[i] = list.get(i).chars().filter(c -> c == 'O').count();
        }
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (count[i] > list.get(i).length() / 2) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

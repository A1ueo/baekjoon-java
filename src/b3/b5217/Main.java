package b3.b5217;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        sc.close();
        ArrayList<pair>[] pairList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            pairList[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (int) Math.round((float) list.get(i) / 2); j++) {
                pairList[i].add(new pair(j, list.get(i) - j));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Pairs for %d: ", list.get(i));
            for (int j = 0; j < pairList[i].size(); j++) {
                if (j != 0)
                    System.out.printf(", ");
                System.out.printf("%d %d", pairList[i].get(j).first, pairList[i].get(j).second);
            }
            System.out.println();
        }

    }

  Main  static class pair {
        int first;
        int second;

        public pair(int i, int j) {
            this.first = i;
            this.first = j;
        }
    }
}

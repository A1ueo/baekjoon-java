package s5.b10814;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Pair<Integer, String>> user = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            String str = sc.nextLine();
            user.add(new Pair<>(num, str));
        }
        sc.close();

        user.sort((a, b) -> (a.first - b.first));
        for (int i = 0; i < user.size(); i++) {
            System.out.printf("%d", user.get(i).first);
            System.out.printf("%s\n", user.get(i).second);
        }
    }

    public static class Pair<A, B> {
        A first;
        B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

    }
}

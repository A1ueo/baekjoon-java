package s5.b11651;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Pair> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            int num1 = Integer.parseInt(tmp[0]);
            int num2 = Integer.parseInt(tmp[1]);
            list.add(new Pair(num1, num2));
        }

        list.sort((a, b) -> {
            if (a.second == b.second)
                return a.first - b.first;
            else
                return a.second - b.second;
        });

        StringBuilder sb = new StringBuilder();
        for (Pair p : list) {
            sb.append(String.format("%d %d%n", p.first, p.second));
        }
        System.out.println(sb.toString());

    }
}

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

package s5.b11650;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Pair> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] buff = br.readLine().split(" ");
            list.add(new Pair(Integer.parseInt(buff[0]), Integer.parseInt(buff[1])));
        }

        list.sort((x, y) -> {
            if (x.first == y.first) {
                return x.second - y.second;
            }
            else return x.first - y.first;
        });

        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            sb.append(pair.first).append(' ').append(pair.second).append('\n');
        }

        System.out.println(sb);
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}

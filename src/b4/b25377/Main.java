package b4.b25377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            int num1 = Integer.parseInt(tmp[0]);
            int num2 = Integer.parseInt(tmp[1]);
            list.add(new Pair(num1, num2));
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int curr = list.get(i).second;
            if (list.get(i).first <= curr) {
                if (curr < min) {
                    min = curr;
                }
            }
        }
        if (min == Integer.MAX_VALUE)
            min = -1;
        System.out.println(min);
    }
}

class Pair Main    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

package s4.b18110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
        }
        list.sort(null);

        int trim = (int) Math.round((double) n * 15 / 100);

        int sum = 0;
        for (int i = trim; i < list.size() - trim; i++) {
            sum += list.get(i);
        }

        int answer = (int) Math.round((double) sum / (list.size() - trim * 2));
        System.out.println(answer);
    }
}

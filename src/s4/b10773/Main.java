package s4.b10773;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(input);
            }
        }

        int sum = 0;
        for (int i : list)
            sum += i;

        System.out.println(sum);
    }
}

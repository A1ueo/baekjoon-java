package s4.b11866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int len = Integer.parseInt(input[0]);
        int period = Integer.parseInt(input[1]);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(i + 1);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int idx = 0;
        bw.write("<");
        for (int count = 1; list.size() > 1; count++) {
            if (count % period == 0) {
                bw.write(list.get(idx) + ", ");
                list.remove(idx);
            } else {
                idx = (idx + 1) % list.size();
            }
        }
        bw.write(list.get(0) + ">");
        bw.flush();
    }
}

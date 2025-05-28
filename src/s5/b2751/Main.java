package s5.b2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: 버퍼 입출력 사용하기
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buff.readLine());
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(buff.readLine());
            sortedSet.add(tmp);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : sortedSet) {
            bw.write(i + "\n");
        }
        bw.flush();
    }
}

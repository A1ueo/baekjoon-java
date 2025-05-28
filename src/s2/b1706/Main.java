package s2.b1706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int row = Integer.parseInt(buff[0]);
        int col = Integer.parseInt(buff[1]);

        String[] arr = new String[row];
        for (int i = 0; i < row; i++) {
            String tmp = br.readLine();
            arr[i] = tmp;
        }
        // TODO:
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < row; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < col; j++) {
                if (arr[i].charAt(j) == '#')
                    continue;
                sb.append(arr[i].charAt(j));
            }

        }

    }
}

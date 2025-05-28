package s3.b1431;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            list.add(tmp);
        }

        list.sort(Comparator.naturalOrder());
        list.sort((x, y) -> {
            int xCount = 0;
            int yCount = 0;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
                    xCount += x.charAt(i) - '0';
                }
            }
            for (int i = 0; i < y.length(); i++) {
                if (y.charAt(i) >= '0' && y.charAt(i) <= '9') {
                    yCount += y.charAt(i) - '0';
                }
            }
            return xCount - yCount;
        });
        list.sort((x, y) -> x.length() - y.length());

        for (String str : list) {
            System.out.println(str);
        }

    }
}

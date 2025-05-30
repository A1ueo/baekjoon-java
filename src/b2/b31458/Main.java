package b2.b31458;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        char[][] arr = new char[t][];
        for (int i = 0; i < t; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '!') {
                    if (list.isEmpty() || list.get(list.size() - 1) == '!') {
                        list.add('!');
                    } else {
                        list.remove(list.size() - 1);
                        list.add('1');
                    }
                } else {
                    list.add(arr[i][j]);
                }
            }
            while (list.size() > 1) {
                if (list.get(list.size() - 1) != '!') {
                    char c = list.remove(list.size() - 1);
                    if (!list.isEmpty())
                        list.remove(list.size() - 1);
                    if (c == '0')
                        list.add('1');
                    else
                        list.add('0');
                }
            }
            sb.append(list.get(0)).append("\n");
        }

        System.out.println(sb.toString());
    }
}

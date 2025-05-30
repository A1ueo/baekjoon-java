package s4.b4949;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String buff;
        while ((buff = br.readLine()).charAt(0) != '.') {
            char[] arr = buff.toCharArray();
            ArrayList<Boolean> list = new ArrayList<>();
            boolean flag = true;
            for (int i = 0; i < buff.length(); i++) {
                if (arr[i] == '.')
                    break;

                switch (arr[i]) {
                    case '(':
                        list.add(true);
                        break;
                    case '[':
                        list.add(false);
                        break;
                    case ')':
                        if (list.isEmpty() || list.get(list.size() - 1) != true) {
                            flag = false;
                        } else {
                            list.remove(list.size() - 1);
                        }
                        break;
                    case ']':
                        if (list.isEmpty() || list.get(list.size() - 1) != false) {
                            flag = false;
                        } else {
                            list.remove(list.size() - 1);
                        }
                        break;
                }
                if (flag == false)
                    break;
            }
            if (flag == false || !list.isEmpty()) {
                sb.append("no\n");
            } else {
                sb.append("yes\n");
            }
        }

        System.out.println(sb.toString());
    }
}

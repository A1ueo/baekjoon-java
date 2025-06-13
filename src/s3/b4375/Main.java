package s3.b4375;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        String buff;
        while ((buff = br.readLine()) != null && !buff.equals("")) {
            int n = Integer.parseInt(buff);
            list.add(n);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int comparison = 1, len = 1;
            while (comparison % list.get(i) != 0) {
                comparison = (comparison * 10 + 1) % list.get(i);
                len++;
            }

            sb.append(len).append('\n');
        }
        
        System.out.println(sb);
    }
}

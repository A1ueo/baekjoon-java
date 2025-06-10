package s3.b4375;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputList = new ArrayList<>();
        String buff;
        while ((buff = br.readLine()) != null && !buff.equals("")) {
            int n = Integer.parseInt(buff);
            inputList.add(n);
        }
        br.close();
        // inputList.sort(null);

        long comparison = 1;
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        while (idx < inputList.size()) {
            if (comparison % inputList.get(idx) == 0) {
                sb.append((int) Math.log10(comparison) + 1).append('\n');
                idx++;
            } else {
                comparison *= 10;
                comparison++;
            }
        }
        
        System.out.println(sb);
    }
}

package b1.b2309;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int[] left = new int[2];
        for(int i = 0; i < 9; i++) {
            int tmp = Integer.parseInt(br.readLine());

            int idx = 0;
            if (set.size() < 7){
                sum += tmp;
                set.add(tmp);
            } else left[idx++] = tmp;
        }

        int over = sum - 100;
        if (set.contains(over + left[0])) {
            set.remove(over + left[0]);
            set.add(left[0]);
        } else if (set.contains(over + left[1])) {
            set.remove(over + left[1]);
            set.add(left[1]);
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort(null);

        StringBuilder sb = new StringBuilder();
        for (int num : list)
            sb.append(num).append('\n');
        
        System.out.println(sb);
    }
}

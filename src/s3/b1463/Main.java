package s3.b1463;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        map.put(x, 0);
        while (true) {
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            boolean flag = false;
            while (it.hasNext()){
                Map.Entry<Integer, Integer> entry = it.next();
                int key = entry.getKey();
                boolean flag1 = false, flag2 = false, flag3 = false;

                if (key % 3 == 0) map.put(key / 3, map.get(key) + 1);
                else flag1 = true;

                if (key % 2 == 0) map.put(key / 2, map.get(key) + 1);
                else flag2 = true;

                if (key - 1 >= 1) map.put(key - 1, map.get(key) + 1);
                else flag3 = true;
                
                if (flag3 && flag2 && flag1){
                    flag = true;
                    break;
                }
                // FIXME: 왜안됨
                it.remove();
            }
            if (flag) break;
        }

        System.out.println(map);
    }
}

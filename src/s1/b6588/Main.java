package s1.b6588;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputList = new ArrayList<>();
        String buff;
        int max = 0;
        while ((buff = br.readLine()) != null && !buff.equals("0")) {
            int tmp = Integer.parseInt(buff);
            if (tmp > max) max = tmp;
            inputList.add(tmp);
        }

        int[] primeArr = getPrimeArr(max);
        Set<Integer> primeSet = new HashSet<>();
        List<Integer> primeLst = new ArrayList<>();
        for (int num : primeArr) {
            if (num != 0) {
                primeLst.add(num);
                primeSet.add(num);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputList.size(); i++) {
            int origin = inputList.get(i);
            for (int j = 0; j < primeLst.size(); j++) {
                int comp = primeLst.get(j);
                if (comp > origin / 2){
                    sb.append("Goldbach's conjecture is wrong.").append('\n');
                    break;
                }
                if (primeSet.contains(origin - comp)) {
                    sb.append(origin).append(" = ").append(comp).append(" + ")
                    .append(origin - comp).append('\n');
                    break;
                }
            }
        }

        System.out.println(sb);
    }

    static int[] getPrimeArr(int max) {
        int[] arr = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 0 || i == 1) continue;
            arr[i] = i;
        }

        for (int i = 3; (i * i) <= max; i++) {
            for (int j = 2; i * j <= max; j++) {
                arr[i * j] = 0;
            }
        }

        return arr;
    }
}

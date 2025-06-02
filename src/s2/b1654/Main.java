package s2.b1654;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        int k = Integer.parseInt(buff.split(" ")[0]);
        int n = Integer.parseInt(buff.split(" ")[1]);

        int[] arr = new int[k];
        int sum = 0;
        for(int i = 0; i < k; i++){
            buff = br.readLine();
            int num = Integer.parseInt(buff);
            arr[i] = num;
            sum += num;
        }

        int div = sum / n;
        int min = Integer.MAX_VALUE;
        for(int a : arr) {
            min = a < min ? a : min;
        }

        System.out.println();
        System.out.println(div);
        System.out.println(min);
        System.out.println(min / div);
    }
}

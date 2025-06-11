package b2.b14648;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int n = Integer.parseInt(buff[0]);
        int q = Integer.parseInt(buff[1]);

        buff = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(buff[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            buff = br.readLine().split(" ");
            int[] queries = Arrays.stream(buff).mapToInt(Integer::parseInt).toArray();
            if (queries[0] == 1) {
                int num1 = queries[1];
                int num2 = queries[2];
                long sum = sum(arr, num1, num2);
                sb.append(sum).append('\n');
                int tmp = arr[num1 - 1];
                arr[num1 - 1] = arr[num2 - 1];
                arr[num2 - 1] = tmp;
            } else if (queries[0] == 2) {
                long result = sum(arr, queries[1], queries[2]) - sum(arr, queries[3], queries[4]);
                sb.append(result).append('\n');
            }
        }

        System.out.println(sb);
    }

    static long sum(int[] arr, int num1, int num2) {
        long result = 0;
        for (int i = num1 - 1; i < num2; i++)
            result += arr[i];
        return result;
    }
}

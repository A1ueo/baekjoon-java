package b1.b18512;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int[] arr = Arrays.stream(buff).mapToInt(Integer::parseInt).toArray();

        int aPos = 2, aInc = 0, bPos = 3, bInc = 1;
        if (arr[2] < arr[3]) {
            aPos = 3;
            aInc = 1;
            bPos = 2;
            bInc = 0;
        }

        // TODO: 안 곂치는 조건?
        if ((arr[aInc] % arr[bInc] == 0 || arr[bInc] % arr[aInc] == 0) && arr[aPos] - arr[bPos] < arr[aInc]) {
            System.out.println(-1);
            return ;
        }

        while (true) {
            int result = (arr[aPos] - arr[bPos]) % arr[bInc];
            if (result == 0) break;

            arr[aPos] += arr[aInc];
        }

        System.out.println(arr[aPos]);
    }
}

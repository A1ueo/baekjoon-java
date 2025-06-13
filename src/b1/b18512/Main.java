package b1.b18512;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        int[] arr = Arrays.stream(buff.split(" ")).mapToInt(Integer::parseInt).toArray();

        int aPosition = arr[3], bPosition =arr[4],
        aIncrease = arr[0], bIncrease = arr[1];

        if (aPosition > bPosition) {
            bPosition = arr[3];
            aPosition = arr[4];
            bIncrease = arr[0];
            aIncrease = arr[1];
        }

    }
}

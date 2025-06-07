package s3.b1929;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int start = Integer.parseInt(buff[0]);
        int end = Integer.parseInt(buff[1]);

        if (end == 1) return;

        boolean[] arr = new boolean[end + 1];
        for (int i = 2; i <= end; i++) {
            arr[i] = true;
        }

        for (int i = 2; (i * i) <= end; i++){
            if (arr[i]) {
                for (int j = i * i; j <= end; j += i)
                    arr[j] = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (arr[i]) sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}

package b2.b14593;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            arr[i] = Arrays.stream(tmp).mapToInt(e -> Integer.valueOf(e)).toArray();
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > arr[idx][0]) {
                idx = i;
            } else if (arr[i][0] == arr[idx][0]) {
                if (arr[i][1] < arr[idx][1]) {
                    idx = i;
                } else if (arr[i][1] == arr[idx][1]) {
                    if (arr[i][2] < arr[idx][2]) {
                        idx = i;
                    }
                }
            }
        }

        System.out.println(idx + 1);

    }
}

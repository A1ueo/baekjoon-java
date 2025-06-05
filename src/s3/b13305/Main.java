package s3.b13305;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] buff = br.readLine().split(" ");
        int[] road = new int[n -1];
        for (int i = 0; i < n - 1; i++) {
            road[i] = Integer.parseInt(buff[i]);
        }
        
        buff = br.readLine().split(" ");
        int[] station = new int[n];
        for (int i = 0; i < n; i++) {
            station[i] = Integer.parseInt(buff[i]);
        }

        int curr = 0;
        BigInteger sum = new BigInteger("0");
        // 탐색으로 기름을 다 채워놓고, 기름이 떨어지면 다시 탐색
        for (int i = 0; i < n - 1; i++) {
            if (curr == 0) {
                curr += road[i];
                sum = sum.add(BigInteger.valueOf(road[i]).multiply(BigInteger.valueOf(station[i])));
                for (int j = i + 1; j < n - 1; j++) {
                    if (station[i] <= station[j]) {
                        curr += road[j];
                        sum = sum.add(BigInteger.valueOf(road[j]).multiply(BigInteger.valueOf(station[i])));
                    } else break;
                }
            }
            curr -= road[i];
        }
        System.out.println(sum);
    }
}

package b3.b2721;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[t];
        for(int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // int[] answerArr = new int[t];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            int sumJ = 0;
            for(int j = 1; j <= arr[i]; j++) {
                int sumK = 0;
                for(int k = 1; k <= j + 1; k++) {
                    sumK += k;
                }
                sumJ += j * sumK;
            }
            sb.append(sumJ).append('\n');
        }

        System.out.println(sb);
    }
}

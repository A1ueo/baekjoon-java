package b2.b2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // 블랙잭
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int n = Integer.parseInt(buff[0]);
        int m = Integer.parseInt(buff[1]);

        buff = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(buff[i]);
        Arrays.sort(arr);

        int max = 0;
        for(int i = 2; i < n; i++){
            for(int j = 1; j < i; j++){
                for(int k = 0; k < j; k++){
                    int curr = arr[i] + arr[j] + arr[k];
                    if(!(curr > m) && curr > max){
                        max = curr;
                    }
                }
            }
        }

        System.out.println(max);
    }
}

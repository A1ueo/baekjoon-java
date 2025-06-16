package g4.b17425;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        int[] arr = new int[t];
        // int max = 0;
        for (int i = 0; i < t; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
        }
        
        int[] sumArr = new int[t];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            boolean[] primeArr = isPrime(num);
            int sum = 0;
            for (int j = 1; (j * j) <= num; j++) {
                if (primeArr[j]) {
                    if (j == num / j) {
                        for (int k = j; j <= num; k += j)
                            sum += j;
                    } else {
                        for (int k = j; j <= num; k += j)
                            sum += j + num / j;
                    }
                }
            }
            sumArr[i] = sum;
        }

        for (int num : sumArr)
            System.out.println(num);
    }

    static boolean[] isPrime(int num) {
        boolean[] arr = new boolean[num + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        for (int i = 3; (i * i) <= num; i++) {
            if(arr[i] == false) break;
            for (int j = 2; i * j <= num; j++) {
                arr[i * j] = false;
            }
        }

        return arr;
    }

}

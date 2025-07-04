package s5.b1427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[arr.length - 1 - i]);
        }
        
        System.out.println(sb);
    }
}

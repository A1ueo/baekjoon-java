package b4.b5524;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s.toLowerCase()).append("\n");
        }

        System.out.println(sb.toString());

    }
}

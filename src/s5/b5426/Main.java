package s5.b5426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        String[] arr = new String[len];
        for(int i = 0; i < len; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {
            int root = (int) Math.sqrt(arr[i].length());
            char[][] tmp = new char[root][root];
            for(int j = 0; j < root; j++) {
                // System.out.println(arr[i].substring(j * root, j * root + root));
                tmp[j] = arr[i].substring(j * root, j * root + root).toCharArray();
            }

            for(int j = 0; j < root; j++){
                for(int k = 0; k < root; k++){
                    sb.append(tmp[k][root - 1 - j]);
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}

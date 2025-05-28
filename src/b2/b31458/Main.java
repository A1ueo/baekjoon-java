package b2.b31458;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            char[] arr = br.readLine().toCharArray();
            if(arr.length == 1) {
                sb.append(arr[0]);
                break;
            }

            int idx = 0;
            while(arr.length != 1) {
                if(arr[idx] == '!') continue;
                else {
                    if(arr[idx + 1] == '!'){
                        arr[idx] = 1;
                    }
                }
            }

        }



    }
}

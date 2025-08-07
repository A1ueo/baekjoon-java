package s5.b1436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String answer = null;
        if (n <= 6) {
            answer = (n - 1) + "666";
        }


        System.out.println(answer);
    }
}

package b1.b3041;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff;
        int count = 0;
        for(int i = 0; i < 4; i++) {
            buff = br.readLine();
            for (int j = 0; j < 4; j++) {
                if (buff.charAt(j) != '.' && buff.charAt(j) < 'A' + i * 4 + j){
                    count += ('A' + i * 4 + j) - buff.charAt(j);
                }
            }
        }

        System.out.println(count);
    }
}

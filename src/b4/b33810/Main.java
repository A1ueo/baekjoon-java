package b4.b33810;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String str = "SciComLove";

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != input.charAt(i))
                count++;
        }

        System.out.println(count);
    }
}

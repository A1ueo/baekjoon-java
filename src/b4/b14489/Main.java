package b4.b14489;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String buff = br.readLine();
        int a = Integer.parseInt(buff.split(" ")[0]);
        int b = Integer.parseInt(buff.split(" ")[1]);

        buff = br.readLine();
        int c = Integer.parseInt(buff);

        int sum = a + b;
        int chicken = c * 2;
        if(sum < chicken) System.out.println(sum);
        else System.out.println(sum - chicken);

    }
}

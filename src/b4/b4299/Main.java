package b4.b4299;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int x = Integer.parseInt(buff[0]);
        int y = Integer.parseInt(buff[1]);

        int first = (x + y) / 2;
        int second = (x - y) / 2;
        if(x < y || (x + y) % 2 != 0)
            System.out.println(-1);
        else
            System.out.println(first + " " + second);
    }
}

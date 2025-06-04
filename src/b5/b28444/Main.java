package b5.b28444;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int h = Integer.parseInt(buff[0]);
        int i = Integer.parseInt(buff[1]);
        int a = Integer.parseInt(buff[2]);
        int r = Integer.parseInt(buff[3]);
        int c = Integer.parseInt(buff[4]);

        System.out.println(h * i - a * r * c);
    }
}

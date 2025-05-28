package b3.b1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int x = Integer.parseInt(buff[0]);
        int y = Integer.parseInt(buff[1]);
        int w = Integer.parseInt(buff[2]);
        int h = Integer.parseInt(buff[3]);

        int xMin = Math.min(Math.abs(x - w), x);
        int yMin = Math.min(y, Math.abs(y - h));
        int min = Math.min(xMin, yMin);

        System.out.println(min);
    }
}

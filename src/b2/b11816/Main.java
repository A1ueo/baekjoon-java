package b2.b11816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        if (buff.charAt(0) == '0') {
            if (buff.charAt(1) == 'x') {
                System.out.println(Integer.parseInt(buff.substring(2), 16));
            } else {
                System.out.println(Integer.parseInt(buff.substring(1), 8));
            }
        } else {
            System.out.println(buff);
        }

    }
}

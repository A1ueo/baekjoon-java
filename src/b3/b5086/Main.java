package b3.b5086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff;

        StringBuilder sb = new StringBuilder();
        while (!"0 0".equals(buff = br.readLine())) {
            String[] arr = buff.split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[1]);

            if (num2 % num1 == 0) sb.append("factor").append('\n');
            else if (num1 % num2 == 0) sb.append("multiple").append('\n');
            else sb.append("neither").append('\n');
        }

        System.out.println(sb);
    }
}

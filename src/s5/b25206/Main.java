package s5.b25206;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double score = 0, count = 0;
        for (int i = 0; i < 20; i++) {
            String[] buff = br.readLine().split(" ");
            if ("P".equals(buff[2]))
                continue;

            float tmp = Float.parseFloat(buff[1]);
            count += tmp;
            switch (buff[2]) {
            case "A+":
                tmp *= 4.5;
                break;
            case "A0":
                tmp *= 4.0;
                break;
            case "B+":
                tmp *= 3.5;
                break;
            case "B0":
                tmp *= 3.0;
                break;
            case "C+":
                tmp *= 2.5;
                break;
            case "C0":
                tmp *= 2.0;
                break;
            case "D+":
                tmp *= 1.5;
                break;
            case "D0":
                tmp *= 1.0;
                break;
            case "F":
                tmp *= 0.0;
                break;
            }
            score += tmp;
        }

        System.out.println(score / count);
    }
}

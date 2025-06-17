package s5.b1193;

import java.io.*;

/* 분수찾기
 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int numerator = 1, denominator = 1;
        boolean flag = false;
        for (int i = 0; i < x; i++) {
            if (flag == true) {
                if (numerator == 1) {
                    numerator++;
                    i++;
                }
                numerator++;
                denominator--;
            } else {
                if (denominator == 1) {
                    denominator++;
                    i++;
                }
                denominator++;
                numerator--;
            }
        }

        System.out.println(numerator + "/" + denominator);
    }
}

package b2.b2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 분해합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        int input = Integer.parseInt(buff);

        int answer = 0;
        // 생성자는 9 * 문자 개수 보다 작아질 수 없음
        int start = input - 9 * buff.length();
        for (int i = start; i < input; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (i + sum == input) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}

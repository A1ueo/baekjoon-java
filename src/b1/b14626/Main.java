package b1.b14626;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        char[] arr = buff.toCharArray();

        int sum = 0, errIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '*') errIdx = i;
            else {
                if (i % 2 == 0) sum += arr[i] - '0';
                else sum += (arr[i] - '0') * 3;
            }
        }

        int answer = 10 - sum % 10;
        if (errIdx % 2 != 0) {
            while (answer % 3 != 0)
                answer += 10;
            answer /= 3;
        }
        answer %= 10;

        System.out.println(answer);
    }
}

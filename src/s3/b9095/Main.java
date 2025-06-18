package s3.b9095;

import java.io.*;

/* 1, 2, 3 더하기
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int tmp = Integer.parseInt(br.readLine());
            int count = 1;
            if (tmp % 6 == 0) {
                count *= divByN(6, tmp);
            }
            if (tmp % 2 == 0) {
                count *= divByN(2, tmp);
            }
            if (tmp % 3 == 0) {
                count *= divByN(3, tmp);
            }
            arr[i] = tmp + count;
        }
        
        for (int num : arr)
            System.out.println(num);
    }

    static int divByN (int n, int num) {
        int count = 1;
        if (num % n == 0) {
            count = 0;
            while (num % n == 0) {
                num /= n;
                count++;
            }
        }

        if (num % 2 == 0) count *= divByN(2, num);
        if (num % 3 == 0) count *= divByN(3, num);
        
        return count;
    }
}

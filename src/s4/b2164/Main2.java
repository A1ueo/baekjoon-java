package s4.b2164;

import java.io.*;

/* 카드2
 * 첫째 줄에 정수 N(1 ≤ N ≤ 500,000)이 주어진다.
 */
public class Main2 {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 홀수는 버리고 시작하는데 1이 들어오면 케이스가 다름
        if (n == 1) {
            System.out.println(1);
            return ;
        }

        // 데이터를 짝수만 큐에 저장
        int[] arr = new int[n / 2];
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                arr[(i - 1) / 2] = i;
        }

        // 마지막 들어온 값에 따라 시작점이 다름
        int count = n % 2;
        while (arr.length > 1) {
            int[] tmp = new int[(int) Math.ceil(arr.length / 2)];
            int idx = 0, oldIdx = 0;
            while(oldIdx < arr.length){
                if (count % 2 == 0) { // 큐를 순회하면서 카운트가 짝수면 버리고
                    oldIdx++;
                } else { // 카운트가 홀수면 꺼내서 제일 뒤에 저장
                    tmp[idx++] = arr[oldIdx++];
                }
                count++;
            }
            arr = tmp;
        }

        // 마지막 남은 데이터를 출력
        System.out.println(arr[0]);
    }
}

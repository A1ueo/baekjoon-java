package s4.b2164;

import java.io.*;
import java.util.*;

/* 카드2
 * 첫째 줄에 정수 N(1 ≤ N ≤ 500,000)이 주어진다.
 */

public class Main {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        int count = 0;
        while (que.size() > 1) {
            if (count % 2 == 0) {
                que.poll();
            } else {
                que.offer(que.poll());
            }
            count++;
        }

        System.out.println(que.poll());
    }
}

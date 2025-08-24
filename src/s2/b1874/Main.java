package s2.b1874;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> numStack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp < numStack.peek()) {
                flag = false;
                break;
            }

            for (; count <= tmp; count++) {
                numStack.push(count);
                sb.append("+\n");
            }
            if (tmp == numStack.peek()) {
                numStack.pop();
                sb.append("-\n");
            }
        }

        if (flag) System.out.println(sb);
        else System.out.println("NO");
    }
}

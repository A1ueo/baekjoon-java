package s2.b1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] inputArr = new int[n];
        for(int i = 0; i < n; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        Deque<Integer> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int curr = 1, idx = 0;
        do { 
            if(!stack.isEmpty() && stack.getLast() == inputArr[idx]) {
                stack.removeLast();
                sb.append('-').append('\n');
                idx++;
            } else {
                stack.add(curr);
                sb.append('+').append('\n');
                curr++;
            }
        } while (curr <= n + 1 && !stack.isEmpty());

        if(stack.isEmpty())
            System.out.println(sb);
        else System.out.println("NO");
    }
}

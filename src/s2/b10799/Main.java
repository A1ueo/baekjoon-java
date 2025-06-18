package s2.b10799;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        char[] arr = buff.toCharArray();

        Deque<Integer> stack = new ArrayDeque<>();
        int count = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(count);
                count++;
            } else {
                int output = stack.pop();
                count--;
                if (arr[i - 1] == ')') sum++;
                else sum += output;
            }
        }

        System.out.println(sum);
    }
}

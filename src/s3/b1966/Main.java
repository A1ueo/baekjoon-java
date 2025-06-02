package s3.b1966;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            String[] buff = br.readLine().split(" ");
            int n = Integer.parseInt(buff[0]);
            int m = Integer.parseInt(buff[1]);

            buff = br.readLine().split(" ");
            int[] arr = new int[n];
            LinkedList<Integer> que = new LinkedList<>();
            for(int j = 0; j < n; j++){
                int value = Integer.parseInt(buff[j]);
                arr[j] = value;
                que.add(value);
            }
            que.sort(Comparator.reverseOrder());
            
            int count = 0, idx = 0;
            while(!que.isEmpty()){
                if(arr[idx] == que.getFirst()){
                    que.remove(0);
                    count++;
                    if(idx == m)
                        break;
                }
                idx = (idx + 1) % arr.length;
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}

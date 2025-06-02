package b1.b12866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int l = Integer.parseInt(br.readLine());
        br.readLine();
        String s = br.readLine();
        char[] arr = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>(4);
        for(char c : arr){
            if(map.containsKey(c)){
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        long answer = 1;
        for(int num : map.values()){
            answer = (answer * num) % 1_000_000_007;
        }

        System.out.println(answer);
    }
}

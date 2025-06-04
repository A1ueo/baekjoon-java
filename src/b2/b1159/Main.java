package b2.b1159;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            char name = br.readLine().charAt(0);
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        Set<Character> keySet = map.keySet();
        StringBuilder sb = new StringBuilder();
        for(char key : keySet) {
            if(map.get(key) >= 5)
                sb.append(key);
        }
        if(sb.length() == 0)
            sb.append("PREDAJA");
            
        System.out.println(sb);
    }
}

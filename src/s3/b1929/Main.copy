package s3.b1929;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int m = Integer.parseInt(buff[0]);
        int n = Integer.parseInt(buff[1]);

        ArrayList<Integer> list = makePrimeList(m, n);

        StringBuilder sb = new StringBuilder();
        for(int num : list)
            sb.append(num).append('\n');
        System.out.println(sb);
    }

    public static ArrayList<Integer> makePrimeList(int start, int end){
        ArrayList<Integer> primeList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        primeList.add(2);
        int range = (int) Math.sqrt(end); // + 1?
        for(int i = 2; i <= end; i++) {
            if(i == 2 || i % 2 != 0){
                if(i >= start)
                    list.add(i);
                if(i <= range)
                    primeList.add(i);
            }
        }

        
        
        for(int i = 0; i < primeList.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j) != primeList.get(i) && 
                    list.get(j) % primeList.get(i) == 0) {
                    list.remove(j--);
                }
            }
        }

        return list;
    }
}

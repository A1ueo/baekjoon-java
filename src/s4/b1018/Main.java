package s4.b1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();

        int n = Integer.parseInt(buff.split(" ")[0]);
        int m = Integer.parseInt(buff.split(" ")[1]);

        char[][] arr = new char[n][];
        for(int i=0; i<n; i++){
            String tmp = br.readLine();
            arr[i] = tmp.toCharArray();
        }

        int count = Integer.MAX_VALUE;
        char[] checker = {'W','B'};
        for(int i = 0; i < n - 8 + 1; i++){
            for(int j = 0; j < m - 8 + 1; j++){
                
                int wCount = 0, bCount = 0;
                for(int k = i; k < i + 8; k++){
                    for(int l = j; l < j + 8; l++){
                        int idx = (i + j) % 2;
                        if((k + l) % 2 == 0) {
                            if(arr[k][l] != checker[idx]) wCount++;
                            else bCount++;
                        } else {
                            if(arr[k][l] == checker[idx]) wCount++;
                            else bCount++;
                        }
                    }
                }
                int subCount =  wCount < bCount ? wCount : bCount;
                count = count < subCount ? count : subCount;
            }
        }

        System.out.println(count);

    }

}

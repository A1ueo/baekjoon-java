package b1.b2684;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());

        int[][] countArr = new int[p][8];
        for(int i = 0; i < p; i++) {
            String str = br.readLine();
            for(int j = 0; j < str.length() - 2; j++) {
                String window = str.substring(j, j + 3);
                countArr[i][count(window)]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int[] arrays : countArr) {
            for(int value : arrays) {
                sb.append(value).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static int count(String str) {
        int result = -1;
        switch (str) {
            case "TTT":
                result = 0;
                break;
            
            case "TTH":
                result = 1;
                break;
            
            case "THT":
                result = 2;
                break;
            
            case "THH":
                result = 3;
                break;
            
            case "HTT":
                result = 4;
                break;
            
            case "HTH":
                result = 5;
                break;
            
            case "HHT":
                result = 6;
                break;
            
            case "HHH":
                result = 7;
                break;
        }

        return result;
    }
}


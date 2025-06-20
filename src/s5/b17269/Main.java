package s5.b17269;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<Character, Integer> map = new HashMap<>() {
            {
                put('A', 3);
                put('B', 2);
                put('C', 1);
                put('D', 2);
                put('E', 4);
                put('F', 3);
                put('G', 1);
                put('H', 3);
                put('I', 1);
                put('J', 1);
                put('K', 3);
                put('L', 1);
                put('M', 3);
                put('N', 2);
                put('O', 1);
                put('P', 2);
                put('Q', 2);
                put('R', 2);
                put('S', 1);
                put('T', 2);
                put('U', 1);
                put('V', 1);
                put('W', 1);
                put('X', 2);
                put('Y', 2);
                put('Z', 1);
            }
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");

        int len1 = Integer.parseInt(buff[0]);
        int len2 = Integer.parseInt(buff[1]);

        buff = br.readLine().split(" ");
        String name1 = buff[0];
        String name2 = buff[1];

        String shortArr = len1 < len2 ? name1 : name2;
        String longArr = len1 > len2 ? name1 : name2;

        int[] arr = new int[len1 + len2];
        for (int i = 0; i < len1 + len2; i++) {
            if (i < shortArr.length() * 2) {
                if (i % 2 == 0) {
                    arr[i] = map.get(name1.charAt(i / 2));
                } else {
                    arr[i] = map.get(name2.charAt((i - 1) / 2));
                }
            } else {
                arr[i] = map.get(longArr.charAt(i - shortArr.length()));
            }
        }

        while (arr.length > 2) {
            int[] arr2 = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1)
                    continue;
                arr2[i] = (arr[i] + arr[i + 1]) % 10;
            }
            arr = arr2;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (arr[0] == 0)
            bw.write(String.valueOf(arr[1]) + "%");
        else
            bw.write(String.valueOf(arr[0]) + String.valueOf(arr[1]) + "%");
        bw.flush();
    }
}

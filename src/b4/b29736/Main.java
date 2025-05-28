package b4.b29736;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        String[] arr = buff.split(" ");
        int range1 = Integer.parseInt(arr[0]);
        int range2 = Integer.parseInt(arr[1]);
        buff = br.readLine();
        String[] arr2 = buff.split(" ");
        int k = Integer.parseInt(arr2[0]);
        int x = Integer.parseInt(arr2[1]);
        int min = k - x;
        int max = k + x;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (max < range1 || min > range2) {
            bw.write("IMPOSSIBLE\n");
        } else {
            int bsil1 = min < range1 ? range1 : min;
            int bsil2 = max > range2 ? range2 : max;
            int friends = bsil2 - bsil1 + 1;
            bw.write(String.valueOf(friends));
        }
        bw.flush();
    }
}

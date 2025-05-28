package b1.b2775;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        int rowMax = 0, colMax = 0;
        for (int i = 0; i < t; i++) {
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());
            list.add(new int[] { num1, num2 });
            rowMax = (rowMax > num1 ? rowMax : num1) + 1;
            colMax = (colMax > num1 ? colMax : num2) + 1;
        }

        int[][] arr = new int[rowMax][colMax];
        for (int i = 0; i < colMax; i++) {
            arr[0][i] = i;
        }
        for (int i = 1; i < rowMax; i++) {
            for (int j = 1; j < colMax; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; i++) {
            bw.write(arr[list.get(i)[0]][list.get(i)[1]] + "\n");
        }
        bw.flush();
    }
}

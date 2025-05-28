package s5.b11650;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputArr = br.readLine().split(" ");
            int num1 = Integer.parseInt(inputArr[0]);
            int num2 = Integer.parseInt(inputArr[1]);
            list.add(new Pair(num1, num2));
        }
        list.sort((a, b) -> (a.second - b.second));
        list.sort((a, b) -> (a.first - b.first));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < list.size(); i++) {
            bw.write(String.format("%d %d\n", list.get(i).first, list.get(i).second));
        }
        bw.flush();
    }
}

class Pair Main    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

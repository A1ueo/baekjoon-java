package s5.b23028;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buff = br.readLine().split(" ");
        int semester = 8 - Integer.parseInt(buff[0]);
        int major = 66 - Integer.parseInt(buff[1]);
        int total = 130 - Integer.parseInt(buff[2]);

        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buff = br.readLine().split(" ");
            int a = Integer.parseInt(buff[0]);
            int b = Integer.parseInt(buff[1]);

            list.add(new Pair(a, b));
        }

        for (int i = 0; i < semester; i++) {

        }


    }
}

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

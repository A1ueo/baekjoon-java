package s4.b10845;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            String cmd = tmp.split(" ")[0];
            switch (cmd) {
                case "push":
                    int num = Integer.parseInt(tmp.split(" ")[1]);
                    list.add(num);
                    break;
                case "pop":
                    if (list.isEmpty()) {
                        bw.write(String.valueOf(-1) + '\n');
                    } else {
                        int pop = list.pop();
                        bw.write(String.valueOf(pop) + '\n');
                    }
                    break;
                case "size":
                    int size = list.size();
                    bw.write(String.valueOf(size) + '\n');
                    break;
                case "empty":
                    if (list.isEmpty()) {
                        bw.write(String.valueOf(1) + '\n');
                    } else {
                        bw.write(String.valueOf(0) + '\n');
                    }
                    break;
                case "front":
                    if (list.isEmpty()) {
                        bw.write(String.valueOf(-1) + '\n');
                    } else {
                        bw.write(String.valueOf(list.getFirst()) + '\n');
                    }
                    break;
                case "back":
                    if (list.isEmpty()) {
                        bw.write(String.valueOf(-1) + '\n');
                    } else {
                        bw.write(String.valueOf(list.getLast()) + '\n');
                    }
                    break;
            }
        }
        bw.flush();
    }
}

package s5.b11723;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            String cmd = tmp.split(" ")[0];
            int num = 0;
            switch (cmd) {
                case "add":
                    num = Integer.parseInt(tmp.split(" ")[1]);
                    if (!set.contains(num))
                        set.add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(tmp.split(" ")[1]);
                    if (set.contains(num))
                        set.remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(tmp.split(" ")[1]);
                    if (set.contains(num))
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(tmp.split(" ")[1]);
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 0; j < 20; j++) {
                        set.add(j + 1);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        bw.flush();
    }
}
